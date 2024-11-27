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
public class LazySingletonFixed {
	
    private static LazySingletonFixed S_INSTANCE = null;
    private static int counter = 0;

    public synchronized static LazySingletonFixed getInstance() {	
        if (LazySingletonFixed.S_INSTANCE == null) {
            LazySingletonFixed.S_INSTANCE = new LazySingletonFixed();
            ++counter;
            System.out.println(counter + " object(s) of type " + LazySingletonFixed.class.getName() + " created!");
        }
	return(LazySingletonFixed.S_INSTANCE);
    }

    private LazySingletonFixed() {
    }
    
}
