/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mci.andrea.singleton;

/**
 *
 * @author AndreaCorradini
 */
public class SingleObjectMain {
    
    static public void main(String argv[]) {       
            SingleObject o1 = null, 
                         o2 = null;

        try {
            o1 = new SingleObject();
            System.out.println("--------------------------------");
            o2 = new SingleObject();
        } catch (SingleObjectException ex) {
            System.out.println("\nFAILED: " + ex.getMessage());
            o2 = o1;
        }        
        System.out.println("o1 is: " + o1);
        System.out.println("o2 is: " + o2.toString());
        
    }

}