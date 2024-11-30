/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.exam.factories;

import at.mci.clemens.exam.paymentstrageties.BankTransferPayment;
import at.mci.clemens.exam.paymentstrageties.PaymentStragety;
import at.mci.clemens.exam.paymentstrageties.CreditCardPayment;
import at.mci.clemens.exam.paymentstrageties.PayPalPayment;
import at.mci.clemens.exam.exceptions.WrongPaymentTypeException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Clemens
 */
public final class PaymentFactory {
    public static PaymentStragety getPayment(String type) throws WrongPaymentTypeException{
        if("BankTransfer".equals(type)){
            System.out.println("Enter IBan");
             // Enter data using BufferReader
            BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
            // Reading data using readLine
            String iBan;
            try {
                iBan = reader.readLine();
            } catch (IOException ex) {
                 throw new WrongPaymentTypeException("Wrong user input");
            }
            return new BankTransferPayment(iBan);
            
        }if ("PayPal".equals(type)){
            System.out.println("Enter Email");
             // Enter data using BufferReader
            BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
            // Reading data using readLine
            String email;
            try {
                email = reader.readLine();
            } catch (IOException ex) {
                 throw new WrongPaymentTypeException("Wrong user input");
            }
            return new PayPalPayment(email);
            
        }if ("CreditCard".equals(type)){
            System.out.println("Enter creditCardNumber");
            // Enter data using BufferReader
            BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
            // Reading data using readLine
            String creditCardNumberstr;
            int creditCardNumber;
            try {
                creditCardNumberstr = reader.readLine();
                creditCardNumber = Integer.parseInt(creditCardNumberstr);
            } catch (IOException ex) {
                throw new WrongPaymentTypeException("Wrong user input");
            }catch (Exception e){
                throw new WrongPaymentTypeException("There has been an error getting the creditCardNumber");
            }
            return new CreditCardPayment(creditCardNumber);
        }else{
            throw new WrongPaymentTypeException("The given Transport is not valid");
        }
    }
}


