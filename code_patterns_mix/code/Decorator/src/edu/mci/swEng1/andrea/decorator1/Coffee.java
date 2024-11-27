
package edu.mci.swEng1.andrea.decorator1;

/**
 *
 * @author ancorradini
 */
public class Coffee extends Drink {

    public Coffee() {  
        super.name = "teurer coffee";
    }
    
    @Override
    public float cost() { 
        return 7.99f;
    }
}
