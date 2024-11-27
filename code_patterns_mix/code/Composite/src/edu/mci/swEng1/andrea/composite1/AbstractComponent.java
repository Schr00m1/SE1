/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mci.swEng1.andrea.composite1;

/**
 *
 * @author Andrea
 * 
 * This is the component which is usually either an abstract class or an interface
 * 
 */
// also java.awt.Component is abstract
public abstract class AbstractComponent {
    
    public abstract void draw();
    public abstract void magnify(int factor);
}
