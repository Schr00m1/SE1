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
public class SingleObject {

    private static boolean created = false;
    
    @Override
    public String toString() {
        return "Hello I am the object of class SO";
    }
    
    
    public SingleObject() throws SingleObjectException {

        if (created) {
            //System.out.println(" failed!");
            throw new SingleObjectException("You cannot create another object! Only one object of type " + SingleObject.class.getName() + " allowed!");
        } else {
            System.out.print("Creation of an object of type " + SingleObject.class.getName());
            created = true;
            // here assign values of data members
            System.out.println(": created! Succesfull!");
        }
    }

}