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
public class EagerSingleton1 {

    private static final EagerSingleton1 S_INSTANCE = new EagerSingleton1();
    	
    public static EagerSingleton1 getInstance() {
        return(EagerSingleton1.S_INSTANCE);
    }
	
    private EagerSingleton1() {
        System.out.println("Creating object...");
    }
 

}
