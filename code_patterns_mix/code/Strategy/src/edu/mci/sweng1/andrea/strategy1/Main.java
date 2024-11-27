/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mci.sweng1.andrea.strategy1;

/**
 *
 * @author Andrea
 */
public class Main {
    
    public static void main(String[] args) {
        Context context;

        StrategyIntf si = Factory.getStrategyFromDB();
        
        context = new Context(si);
        context.executeStrategy(5);
 
        //context = new Context(new ConcreteStrategySqrt());
        context.setStrategy(new ConcreteStrategySqrt());
        context.executeStrategy(49);
    }
    
}
