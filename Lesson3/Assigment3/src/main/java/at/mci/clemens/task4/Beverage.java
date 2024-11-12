/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.task4;

/**
 *
 * @author Clemens
 */
public class Beverage {
    //mandetory parameter
    private final String type;
    private final String size;
    private final int temperature;
    
    //optional parameters
    private final boolean hasSugar;
    private final boolean hasCream;
    private final boolean hasMilk;
    
    private Beverage(Builder builder){
        this.type = builder.type;
        this.temperature = builder.temperature;
        this.size = builder.size;
        this.hasCream = builder.hasCream;
        this.hasMilk = builder.hasMilk;
        this.hasSugar = builder.hasSugar;
    }
    
    /**
     *
     */
    public static class Builder{
        //mandetory parameter
        private final String type;
        private final String size;
        private final int temperature;

         //optional parameters
        private boolean hasSugar = false;
        private boolean hasCream = false;
        private boolean hasMilk = false;
        
        /**
         *the constructor for the mandetory elements which are type size and temperature 
         * 
         * @param type
         * @param size
         * @param temperature
         */
        public Builder(String type, String size, int temperature){
            this.type = type;
            this.size = size;
            this.temperature = temperature;
        }

        /**
         *
         * @return
         */
        public Builder addSugar(){
            this.hasSugar = true;
            return this;
        }

        /**
         *
         * @return
         */
        public Builder addCream(){
            this.hasCream = true;
            return this;
        }

        /**
         *
         * @return
         */
        public Builder addMilk(){
            this.hasMilk = true;
            return this;
        }

        /**
         *
         * @return
         */
        public Beverage build(){
            return new Beverage(this);
        }
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Beverage{" + "type=" + type + ", size=" + size + ", temperature=" + temperature + ", hasSugar=" + hasSugar + ", hasCream=" + hasCream + ", hasMilk=" + hasMilk + '}';
    }
        
}
