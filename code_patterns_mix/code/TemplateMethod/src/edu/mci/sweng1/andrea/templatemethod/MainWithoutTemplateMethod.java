/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mci.sweng1.andrea.templatemethod;

/**
 *
 * @author Andrea
 */
public class MainWithoutTemplateMethod {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = {2, 3, 5, 1, 9, -2, 0, 4};
        
        SortAscendingWithoutPattern sA = new SortAscendingWithoutPattern(array);
        System.out.println("Before ascending: " + sA);
        sA.sortA();
        System.out.println("After ascending: " + sA);
        
        SortDescendingWithoutPattern sD = new SortDescendingWithoutPattern(array);
        System.out.println("Before descending: " + sD);
        sD.sortD();
        System.out.println("After descending: " + sD);
    }
    
}
