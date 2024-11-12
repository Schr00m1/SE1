/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.task2;

/**
 *
 * @author Clemens
 */
public class MainPeriodic {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        PeriodicTable myTable = PeriodicTable.C_INSTANCE;
        myTable.addElement(1, "Hydrogen", "H");
        try{
            myTable.printElement(1);
            myTable.printElement(2);
        }catch(PeriodicNumOutOfRangeException e){
            System.out.println(e);
        }
        myTable.addElement(2, "Helium", "He");
        myTable.addElement(92, "Uranium", "U");
        myTable.printAllElements();
        System.out.println("----------------------------------");
        myTable.addElement(200, "Wrong", "w");
       myTable.addElement(100, "Wrong", "WES");
       myTable.printAllElements();
    }
}
