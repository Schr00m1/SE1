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
public class LazySingleton {

    private static LazySingleton S_INSTANCE = null;
    private static int counter = 0;
	
    private LazySingleton() {
        System.out.println("CREATED AN OBJECT OF TYPE " + this.getClass().getTypeName());
    }

    public static LazySingleton getInstance() {	
        if (S_INSTANCE == null) {
            S_INSTANCE = new LazySingleton();
            ++counter;
            System.out.println(counter + " object(s) of type " + LazySingleton.class.getName() + " created!");
        } else {
            System.out.println("No call to the new operator: meaning no objects is being created!");
        }
	return(S_INSTANCE);	
    }
    
}
