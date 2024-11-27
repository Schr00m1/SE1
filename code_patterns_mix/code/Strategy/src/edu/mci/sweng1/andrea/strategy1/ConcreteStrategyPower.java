
package edu.mci.sweng1.andrea.strategy1;

/**
 *
 * @author Andrea
 */
public class ConcreteStrategyPower implements StrategyIntf {

    @Override
    public int calculate(int value) {
        int res = value*value;
        System.out.println("--------- Power of 2 ---------");
        System.out.println("Power of two of " + value + " is " + res);
        return res;
    }
}
