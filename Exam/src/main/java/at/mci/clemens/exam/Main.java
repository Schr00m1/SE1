/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.exam;

import at.mci.clemens.exam.exceptions.BookingException;

/**
 *
 * @author Clemens
 */
public class Main {
    public static void main(String[] args) {
        try{
        TransportApp.appInstance.BookTrip("Taxi", "PayPal", "MCI" ,50);
        } catch (BookingException e){
            System.out.println(e);
        }
        System.out.println("------------------------------------------------");
        try{
        TransportApp.appInstance.BookTrip("Helicopte", "BankTransfer", "Munich" ,170);
        } catch (BookingException e){
            System.out.println(e);
        }
        System.out.println("------------------------------------------------");
        try{
            TransportApp.appInstance.BookTrip("Vaporetto", "CreditCard" , "Venice", 10);
        }catch (BookingException e){
            System.out.println(e);
        }
    }
}
