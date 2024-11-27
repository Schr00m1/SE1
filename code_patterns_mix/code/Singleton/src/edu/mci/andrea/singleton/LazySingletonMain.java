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
public class LazySingletonMain {
    
    public static void main(String[] args) {
                
        LazySingleton ls1 = LazySingleton.getInstance();
        System.out.println("++++++++++++++++++");
        LazySingleton ls2 = LazySingleton.getInstance();
        System.out.println((ls1 == ls2) ? "It is a Singleton\n" : "Not a singleton\n");
    }
    
}
