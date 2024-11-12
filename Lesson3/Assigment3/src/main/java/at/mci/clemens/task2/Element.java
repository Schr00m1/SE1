/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package at.mci.clemens.task2;

/**
 *
 * @author Clemens
 */
public class Element {
    
    private final int periodicNumber;
    private final String name;
    private final String symbol;
    
    public Element(int periodicNumber, String name, String symbol){
        this.periodicNumber = periodicNumber;
        this.name = name;
        this.symbol = symbol;
        System.out.println("Created Element: " + this.name + "  " + this.symbol +  " with Peridic Number " + this.periodicNumber);
    }

    public int getPeriodicNumber() {
        return periodicNumber;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return "Element{" + periodicNumber + ", name=" + "periodicNumber="  + name + ", symbol=" + symbol + '}';
    }
    
    
    
}
