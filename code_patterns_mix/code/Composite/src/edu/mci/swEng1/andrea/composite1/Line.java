
package edu.mci.swEng1.andrea.composite1;

/**
 *
 * @author Andrea
 * 
 * This is a leaf i.e. a concrete implementation of the AbstractComponent
 * 
 */
public class Line extends AbstractComponent {

    private String name;
    private int length;
    
    public Line(String name, int length) {
        this.name = "Line: " + name;
        this.length = length;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a Line " + this.name + " of length " + this.length);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void magnify(int factor) {
        if (factor > 0) {
            length *= factor;
        } else {
            length /= factor;
        }
        System.out.println("Magnifying a Line to a length of " + length);
    }

}
