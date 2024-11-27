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
public class EagerSingleton2Main {

    public static void main(String[] args) {
        EagerSingleton2 ls1 = EagerSingleton2.S_INSTANCE;
        EagerSingleton2 ls2 = EagerSingleton2.S_INSTANCE;
        System.out.println((ls1 == ls2) ? "Singleton\n" : "Not a singleton\n"); 
    }

}
