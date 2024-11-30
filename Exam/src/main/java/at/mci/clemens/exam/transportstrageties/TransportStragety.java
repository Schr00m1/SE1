/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.exam.transportstrageties;

/**
 *
 * @author Clemens
 */
public abstract class TransportStragety {
    final int pricePerkm;

    /**
     *
     * @param location
     * @param kilometers
     * @return
     */
    public abstract int transportPerson(String location, int kilometers);
    
    /**
     *
     */
    protected  TransportStragety(){
        System.out.println("There has been an error with the transport stregety");
        this.pricePerkm = 0;
    }

    /**
     *
     * @param price
     */
    protected TransportStragety(int price){
        this.pricePerkm = price;
    }
}
    
