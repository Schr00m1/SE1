/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package at.mci.clemens.task2;

/**
 *defualt class for all ele,ents
 * @author Clemens
 */
public class Element {
    
    private final int periodicNumber;
    private final String name;
    private final String symbol;
    
    /**
     *constructor for the elements 
     * @param periodicNumber int has to be bigger than 0 and smaller than 0
     * @param name name of element
     * @param symbol symbol of element max 2 chars and not 0 
     */
    public Element(int periodicNumber, String name, String symbol){
        this.periodicNumber = periodicNumber;
        this.name = name;
        this.symbol = symbol;
        System.out.println("Created Element: " + this.name + "  " + this.symbol +  " with Peridic Number " + this.periodicNumber);
    }

    /**
     *getter for periodic number
     * @return
     */
    public int getPeriodicNumber() {
        return periodicNumber;
    }

    /**
     *getter for name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *getter for symbol
     * @return
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     *prints the info for element
     * @return
     */
    @Override
    public String toString() {
        return "Element{" + periodicNumber + ", name=" + "periodicNumber="  + name + ", symbol=" + symbol + '}';
    }
    
    
    
}
