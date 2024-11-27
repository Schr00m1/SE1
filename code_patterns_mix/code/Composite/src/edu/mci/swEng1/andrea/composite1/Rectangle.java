/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mci.swEng1.andrea.composite1;

/**
 *
 * @author ancorradini
 */
public class Rectangle extends AbstractComponent {

    private String name;
    private int width, height;
    
    public Rectangle(String name, int width, int height) {
        this.name = "Rectangle: " + name;
        this.height = height;
        this.width = width;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle " + this.name + " with height and width --> h:" 
                + this.height + " w:" + this.width);
        // here graphical drawing
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void magnify(int factor) {
        if (factor > 0) {
            this.height *= factor;
            this.width *= factor;
        } else {
            this.height /= factor;
            this.width /= factor;
        }
    }
    
    
}
