/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mci.swEng1.andrea.composite1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andrea
 * 
 * This is a Composite
 * 
 */
public class TechnicalDrawing extends AbstractComponent {

    private List<AbstractComponent> compositeObjs = new ArrayList<>();
    
    public void add(AbstractComponent cd, String msg) {
        System.out.println("Adding component " + msg + " to composite");
        compositeObjs.add(cd);
    }
    
    public void remove(AbstractComponent cd, String msg) {
        System.out.println("Remove component " + msg + " to composite");
        compositeObjs.remove(cd);
    }
    
    @Override
    public void draw() {
        // Iterate over the components
//        for(int i=0; i < compositeObjs.size(); ++i) {
//            // Obtain a reference to the component and invoke its draw method
//            AbstractComponent component = compositeObjs.get(i);
//            component.draw();
//        }
        for (AbstractComponent aC : compositeObjs) {
            aC.draw();
        }
    }

    @Override
    public void magnify(int factor) {
        for (AbstractComponent aC : compositeObjs) {
            aC.magnify(factor);
        }
    }
    
}
