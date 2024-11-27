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
public class Sweetener extends DrinkDecorator {
    
    
    public Sweetener(Drink d){
        super.d = d;
    }
    
    @Override
    public String getName() {
        return d.getName() + ", sweet";
    }
    
    @Override
    public float cost() {
        return d.cost() + 2.95f;
    }
    
}
