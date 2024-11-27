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
public class Tea extends Drink {

    public Tea() {  
        name = "expensive tea";
    }
    
    @Override
    public float cost() { 
        return 5.95f;
    }

}
