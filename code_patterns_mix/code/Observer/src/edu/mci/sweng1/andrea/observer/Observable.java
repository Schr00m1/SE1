/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mci.sweng1.andrea.observer;

/**
 *
 * @author Andrea
 */
public interface Observable {
    public void register(Observer obj); // register observers
    public void unregister(Observer obj);  // unregister observers
    public void notifyObservers(); // notify observers of any change
}
