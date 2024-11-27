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
public class University implements Observer {

    @Override
    public void update() {
        System.out.println("University: notified a change for UNDISCLOSED person!");        
    }

    @Override
    public void update(Object obj) {
        // update the university record given the change of name
        Person person = (Person) obj;
        System.out.println("University: notified a change in record of " + person);

    }

}