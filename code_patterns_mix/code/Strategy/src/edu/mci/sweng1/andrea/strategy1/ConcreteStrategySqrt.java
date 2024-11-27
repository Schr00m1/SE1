
package edu.mci.sweng1.andrea.strategy1;

/**
 *
 * @author Andrea
 */
public class ConcreteStrategySqrt implements StrategyIntf {

    @Override
    public int calculate(int value) {
        int res = (int) Math.sqrt(value);
        System.out.println("--------- SQRT ---------");
        System.out.println("Sqrt of " + value + " is " + res);
        return res;
    }

}
