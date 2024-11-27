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
public class EagerSingleton1Main {
    
    public static void main(String[] args) {
        System.out.println("before anything...");
        EagerSingleton1 ls1 = EagerSingleton1.getInstance();
        System.out.println("after first call...");
        EagerSingleton1 ls2 = EagerSingleton1.getInstance();
        System.out.println("after second call...");
        System.out.println((ls1 == ls2) ? "it is a Singleton\n" : "Not a singleton\n"); 
    }
    
}