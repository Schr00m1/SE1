/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mci.sweng1.andrea.templatemethod;

/**
 *
 * @author Andrea
 */
public class SortAscending extends SortTemplateMethod {

    public SortAscending(int[] array) {
        super(array);
    }

    @Override
    public boolean isToBeSwapped(int a, int b) {
        return (a > b) ? true : false;
    }

}
