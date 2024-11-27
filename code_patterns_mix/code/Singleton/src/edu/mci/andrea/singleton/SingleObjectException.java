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
public class SingleObjectException extends Exception {
    private String msg;
    
    public SingleObjectException() {
        super();
    }
    
    public SingleObjectException(String s) {
        super(s);
        msg = s;
    }

    public String getMsg() {
        return msg;
    }

}
