
package edu.mci.sweng1.andrea.strategy1;

/**
 *
 * @author Andrea
 */
public class Context {
    private StrategyIntf strategy;

    public Context(StrategyIntf strategy) {
        this.strategy = strategy;
    }

    public StrategyIntf getStrategy() {
        return strategy;
    }

    public void setStrategy(StrategyIntf strategy) {
        this.strategy = strategy;
    }
    
    public void executeStrategy(int value) {
        int res = strategy.calculate(value);
        System.out.println("Calculated " + res + " in Context");
    }

}