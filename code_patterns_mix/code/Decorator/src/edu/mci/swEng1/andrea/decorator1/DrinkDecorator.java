/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mci.swEng1.andrea.decorator1;

/**
 *
 * @author andc
 */
public abstract class DrinkDecorator extends Drink {
    
    protected Drink d;
    
    @Override
    public abstract String getName();

}
