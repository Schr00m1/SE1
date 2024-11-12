/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.task3;

/**
 *
 * @author Clemens
 */
public class MainTask3 {
    public static void main(String[] args) {
        AutomaticDispenser dispenser = AutomaticDispenser.C_INSTANCE;
        Beverage drink = dispenser.dispenseDrink();
        System.out.println(drink.getType());
    }
}
