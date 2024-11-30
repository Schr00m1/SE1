/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.exam.exceptions;

/**
 *
 * @author Clemens
 */
public class WrongPaymentTypeException extends Exception {
    public WrongPaymentTypeException(String message){
        super(message);
    }
}
