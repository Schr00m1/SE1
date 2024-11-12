/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.task3;

/**
 *
 * @author Clemens
 */
public class AutomaticDispenser {
    public static final AutomaticDispenser C_INSTANCE = new AutomaticDispenser();
    
    private AutomaticDispenser(){}
    
    public Beverage dispenseDrink(){
        return BeverageFactory.createDrink();
    }
}
