/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.exam.transportstrageties;

/**
 *
 * @author Clemens
 */
public class VaporettoTransport extends TransportStragety {

    public VaporettoTransport() {
        super(20);
    }

    @Override
    public int transportPerson(String location, int kilometers) {
        int priceForTrip = kilometers*this.pricePerkm;
        System.out.println("Person is traveling with Vaporetto to "  + location + " which is a " + kilometers + " long trip and costs " + priceForTrip + "€");
        return priceForTrip;
    }
}
