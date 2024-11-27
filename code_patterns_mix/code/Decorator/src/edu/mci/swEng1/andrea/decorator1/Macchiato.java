/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mci.swEng1.andrea.decorator1;

/**
 *
 * @author ancorradini
 */
public class Macchiato extends DrinkDecorator {

    public Macchiato(Drink d){
        super.d = d;
    }
    
    @Override
    public String getName() {
        return d.getName() + ", macchiato with milk";
    }

    @Override
    public float cost() {
        return d.cost() + 0.99f;
    }

    
}
