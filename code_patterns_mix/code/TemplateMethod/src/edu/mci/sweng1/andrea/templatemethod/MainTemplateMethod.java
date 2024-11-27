/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mci.sweng1.andrea.templatemethod;

/**
 *
 * @author Andrea
 */
public class MainTemplateMethod {
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] array = {2, 3, 5, 1, 9, -2, 0, 4};
        
        SortTemplateMethod sA = new SortAscending(array);
        System.out.println("Ascending before: " + sA);
        sA.sort();
        System.out.println("Ascending after: " + sA);
        
        SortTemplateMethod sD = new SortDescending(array);
        System.out.println("Descending before: " + sD);
        sD.sort();
        System.out.println("Descending after: " + sD);
                
    }

    
}
