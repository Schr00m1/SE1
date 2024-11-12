/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.task4;

/**
 *
 * @author Clemens
 */
public class mainTask4 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
            Beverage drink1 = new Beverage.Builder("Coffee", "large", 36).addCream().addSugar().build();
            System.out.println(drink1.toString());
            Beverage drink2 = new Beverage.Builder("tea", "small", 100).addSugar().build();
            System.out.println(drink2.toString());
            Beverage drink3 = new Beverage.Builder("Water", "Huge", 10).build();
            System.out.println(drink3.toString());
    }
}
