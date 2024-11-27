/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mci.sweng1.andrea.strategy1;

/**
 *
 * @author ancorradini
 */
public class Factory {
    
    public static StrategyIntf getStrategy() {
        if (Math.random() > 0.5) {
            return new ConcreteStrategyPower();
        }
        return new ConcreteStrategySqrt();
    }
    
    public static StrategyIntf getStrategyFromDB() {
        // read a value from a database
        double value = Math.random();
        if (value > 0.5) {
            return new ConcreteStrategyPower();
        }
        return new ConcreteStrategySqrt();
    }
    
}
