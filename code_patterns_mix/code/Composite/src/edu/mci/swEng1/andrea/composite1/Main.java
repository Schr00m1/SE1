/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mci.swEng1.andrea.composite1;

/**
 *
 * @author Andrea
 */
public class Main {
    
    public static void main( String[] args ) {
        
        Line line1 = new Line("Line 1",23);
        Line line2 = new Line("Line 2", 12);       
        Square square = new Square("Square 1",13);
        Circle circle = new Circle("Circle 1", 20);
        
        // Draw individual components - don't use composite pattern
//        System.out.println("Draw individual components without using composite pattern");
//        line1.draw();
//        line2.draw();
//        square.draw();
//        circle.draw();
//        square.magnify(2);
//        line2.magnify(4);
        
        // Build a composite object and draw it
        System.out.println("\nBuild a composite object and draw it");
        TechnicalDrawing td = new TechnicalDrawing();
        td.add(line1,"line 1");
        td.add(line2,"line 2");
        td.add(square,"Square 1");
        td.add(circle, "Circle 1 ");
        System.out.println("Drawing composite: BEGIN");
        td.draw();
        System.out.println("Drawing composite: END");
        System.out.println("Drawing BIGGER composite: BEGIN");
        
//        TechnicalDrawing biggerTD = new TechnicalDrawing();
//        biggerTD.add(td,"Technical Drawing usied before");
//        biggerTD.add(new Line("L3",190000),"Line 3");
//        biggerTD.add(new Rectangle("New primitive Rectangle", 300, 200), "New Rectangle element added");
//        biggerTD.draw();
//
//        System.out.println("Drawing BIGGER composite: END");
    }
    
}
