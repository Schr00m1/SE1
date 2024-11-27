/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mci.swEng1.andrea.composite1;

/**
 *
 * @author Andrea
 * 
 * This is a leaf i.e. a concrete implementation of the AbstractComponent
 * 
 */
public class Square extends AbstractComponent {

    private String name;
    private int edge;
    
    public Square(String name, int edge) {
        this.name = "Square: " + name + " - " + edge;
        this.edge = edge;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a Square with edges of length --> " + edge);
        // here graphical drawing
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return edge;
    }

    public void setNumber(int number) {
        this.edge = number;
    }

    @Override
    public void magnify(int factor) {
        this.edge *= factor;
        System.out.println("Magnifying a square to an edge of " + this.edge);
    }

}