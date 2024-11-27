/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mci.andrea.telescoping;

/**
 *
 * @author AndreaCorradini
 */
public class Telescoping {
 
    private int m1;  // mandatory field
    private int m2;  // mandatory field
 
    private int o1;  // optional field
    private int o2;  // optional field
    private int o3;  // optional field
 
    public Telescoping(int m1, int m2) {
        this(m1, m2, 10);
    }
     
    public Telescoping(int m1, int m2, int o1) {
        this(m1, m2, o1, 10);
    }
 
    public Telescoping(int m1, int m2, int o1, int o2) {
        this(m1, m2, o1, o2, 10);
    }
 
    public Telescoping(int m1, int m2, int o1, int o2, int o3) {
        this.m1 = m1;
        this.m2 = m2;
        this.o1 = o1;
        this.o2 = o2;
        this.o3 = o3;
    }
    
}
