/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mci.sweng1.andrea.templatemethod;

/**
 *
 * @author Andrea
 */
public abstract class SortTemplateMethod {

    protected int[] array;
    
    public SortTemplateMethod(int[] array) {
        this.array = array;
    }

    // this is the actual template method
    public final void sort() {
        for (int i = 0; i<(array.length-1); ++i)
            for (int k = i; k < array.length; ++k)
                if (isToBeSwapped(array[i], array[k])) {
                    swap(i, k);
                }
    }
      
    // hook method
    public abstract boolean isToBeSwapped(int i, int k);
    
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