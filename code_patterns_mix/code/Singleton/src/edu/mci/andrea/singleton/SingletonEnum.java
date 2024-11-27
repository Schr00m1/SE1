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
public enum SingletonEnum {
    S_INSTANCE;
    private int dataField;
    

    private SingletonEnum() {
        System.out.println("Constructor called...");
    }
    /**
     * @return the dataField
     */
    public int getDataField() {
        return dataField;
    }
    
    /**
     * @param dataField the dataField to set
     */
    public void setDataField(int dataField) {
        this.dataField = dataField;
    }

}
