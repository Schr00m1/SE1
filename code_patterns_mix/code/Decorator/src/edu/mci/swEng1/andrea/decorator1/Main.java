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
public class Main {

    public static void main(String[] args) {
        Drink tea = new Tea();
        System.out.println(tea.getName() + " : " + tea.cost() + "EU");
        // wrap a tea with a sweetener
        Sweetener sweeter = new Sweetener(tea); 
        System.out.println(sweeter.getName() + " : " + sweeter.cost() + "EU");
        
        System.out.println("---------------");
        
        Drink coffee = new Coffee();
        System.out.println(coffee.getName() + " : " + coffee.cost() + "EU");
        // wrap a coffee with a macchiato
        Macchiato conLatte = new Macchiato(coffee); 
        System.out.println(conLatte.getName() + " : " + conLatte.cost() + "EU");
        
        System.out.println("---------------");
        
        Drink coffeeCorretto = new Coffee();
        System.out.println(coffeeCorretto.getName() + " : " + coffeeCorretto.cost() + "EU");
        // wrap a coffee with a macchiato
        Corretto corretto = new Corretto(coffeeCorretto); 
        System.out.println(corretto.getName() + " : " + corretto.cost() + "EU");

    }
    
}
