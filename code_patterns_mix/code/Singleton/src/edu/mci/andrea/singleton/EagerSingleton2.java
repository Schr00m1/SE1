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
public class EagerSingleton2 {

    public static final EagerSingleton2 S_INSTANCE = new EagerSingleton2();
    
    private EagerSingleton2() {
    }
    
}
