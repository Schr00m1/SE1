
package edu.mci.swEng1.andrea.composite1;

/**
 *
 * @author ancorradini
 */
public class Circle extends AbstractComponent {

    private String name;
    private int radius;

    
    public Circle(String name, int radius) {
        this.name = "Circle: " + name;
        this.radius = radius;
    }
    
    
    @Override
    public void draw() {
        System.out.println("Drawing Circle " + this.name + " with radius " + this.radius);
        // here coding to draw the actual circle
    }

    @Override
    public void magnify(int factor) {
        if (factor > 0) {
            radius *= factor;
        } else {
            radius /= factor;
        }
        System.out.println("Zooming in a Circle " + this.name + " with radius " + this.radius);
    }
    
        
}
