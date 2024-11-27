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
public class SingletonEnumMain {
    
    public static void main(String[] args) {
        SingletonEnum s1 = SingletonEnum.S_INSTANCE;
        SingletonEnum s2 = SingletonEnum.S_INSTANCE;
        s1.setDataField(1);
        s2.setDataField(2);
        System.out.println((s1 == s2) ? "Singleton\n" : "Not a singleton\n");
        System.out.println("Data field is the same: " + (s1.getDataField() == s2.getDataField()));
    }

}
