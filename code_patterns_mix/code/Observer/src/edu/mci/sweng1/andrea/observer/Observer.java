/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mci.sweng1.andrea.observer;

/**
 *
 * @author Andrea
 * 
 * Use a custom-defined Observer interface!
 * 
 */
public interface Observer {
    public void update(); // update the observer; it is used by Observable
    public void update(Object obj); // update the observer with info in obj
}
