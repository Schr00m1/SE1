/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.exam.factories;

import at.mci.clemens.exam.transportstrageties.MotorbikeTransport;
import at.mci.clemens.exam.transportstrageties.HelicopterTransport;
import at.mci.clemens.exam.transportstrageties.TaxiTransport;
import at.mci.clemens.exam.transportstrageties.TransportStragety;
import at.mci.clemens.exam.transportstrageties.VaporettoTransport;
import at.mci.clemens.exam.exceptions.WrongTansportTypeException;

/**
 *
 * @author Clemens
 */
public final class TransportFactory {
    
    /**
     *
     * @param type the type of transport we want to create
     * @return returns the correct type of transport 
     * @throws WrongTansportTypeException throws an exception if an error occours
     */
    public static TransportStragety getTransport(String type) throws WrongTansportTypeException{
        if("Taxi".equals(type)){
            return new TaxiTransport();
        }if ("Vaporetto".equals(type)){
            return new VaporettoTransport();
        }if ("Motorbike".equals(type)){
            return new MotorbikeTransport();
        }if("Helicopter".equals(type)){
            return new HelicopterTransport();
        }else{
            throw new WrongTansportTypeException("The given Transport is not valid");
        }
    }
}
