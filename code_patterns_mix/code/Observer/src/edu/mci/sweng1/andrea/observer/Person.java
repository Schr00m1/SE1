/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mci.sweng1.andrea.observer;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Andrea
 * 
 * this is the Subject being observed!
 * 
 */
public class Person implements Observable {
    
    private List<Observer> observers = new ArrayList<Observer>();
    
    private String name;
    private String address;
    private MaritalStatus status;
    private boolean privacySetting = true;

    public Person(String name, String address, MaritalStatus status) {
        this.name = name;
        this.address = address;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void changeNameInto(String name) {
        this.name = name;
        //send a notification to all observers along with the some additional data (the name)
        notifyObservers();
    }
    
    public void changeAddressInto(String address) {
        this.address = address;
        //send a notification to all observers along with the some additional data (the name)
        notifyObservers();
    }

    public void changeMaritalStatusInto(MaritalStatus ms) {
        this.status = ms;
        //send a notification to all observers along with the some additional data (the name)
        notifyObservers();
    }
    
    @Override
    public void register(Observer observer) {
        if (observer == null) {
            throw new NullPointerException("Observer object is null!");
        }
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            if (privacySetting) {
                observer.update();
            } else { // send additional info to the observers
                observer.update(this);
            }
        
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Address: %s, MaritalStatus: %s", 
                name, address, status);
    }
    
    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setStatus(MaritalStatus status) {
        this.status = status;
    }

    public void setPrivacySetting(boolean privacySetting) {
        this.privacySetting = privacySetting;
    }

}