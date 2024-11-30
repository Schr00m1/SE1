/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.exam;

import at.mci.clemens.exam.factories.TransportFactory;
import at.mci.clemens.exam.factories.PaymentFactory;
import at.mci.clemens.exam.transportstrageties.TransportStragety;
import at.mci.clemens.exam.paymentstrageties.PaymentStragety;
import at.mci.clemens.exam.exceptions.BookingException;
import at.mci.clemens.exam.exceptions.WrongPaymentTypeException;
import at.mci.clemens.exam.exceptions.WrongTansportTypeException;

/**
 *
 * @author Clemens
 */
public final class TransportApp {
    private String transportType;
    private String paymentType;
    private PaymentStragety payment;
    private TransportStragety transport;
    
    public static final TransportApp appInstance = new TransportApp();
    
    private TransportApp(){}
    
    public void BookTrip(String transportType, String paymentType, String location, int kilometers) throws BookingException{
            try{
            this.transport = TransportFactory.getTransport(transportType);
            }catch (WrongTansportTypeException e){
                
                throw new BookingException("There has been an error with the transport type" + e);
            }
            try{
                this.payment = PaymentFactory.getPayment(paymentType);
            }catch(WrongPaymentTypeException e ){
                
                throw new BookingException("There has been an error with the payment Type " + e);
            }
            int cost = this.transport.transportPerson(location, kilometers);
            this.payment.pay(cost);
            
    }
}
