/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mci.sweng1.andrea.templatemethod;

/**
 *
 * @author Andrea
 */
public class SortDescendingWithoutPattern {

    private int[] array;
    
    public SortDescendingWithoutPattern(int[] array) {
        this.array = array;
    }
    
    public void sortD() {
        for (int i = 0; i<(array.length-1); ++i)
            for (int k = i; k < array.length; ++k)
                if (array[i] < array[k]) { // needSwap()
                    swap(i, k);
                }
    }
   
    
    private void swap(int i, int k) {
        int tmp = array[i];
        array[i] = array[k];
        array[k] = tmp;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i=0; i<array.length; ++i) {
            result.append(array[i]).append(" ");
        }
        return result.toString();
    }

}
