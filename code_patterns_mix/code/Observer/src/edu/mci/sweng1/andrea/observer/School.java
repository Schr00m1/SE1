/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mci.sweng1.andrea.observer;

/**
 *
 * @author Andrea
 * 
 * This is an observer
 * 
 */
public class School implements Observer {

    @Override
    public void update() {
        System.out.println("School: notified a change for UNDISCLOSED person!");    
    }

    @Override
    public void update(Object obj) {
        // update the school record given the change of name
        Person person = (Person) obj;
        System.out.println("School: notified a change in record of " + person);

    }

}
