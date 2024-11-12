/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.task3;
import java.time.LocalTime;

/**
 *
 * @author Clemens
 */
public class BeverageFactory {
    private static final LocalTime coffeStart = LocalTime.of(6,0);
    private static final LocalTime coffeEnd = LocalTime.of(15,0);
    private static final LocalTime teaStart = LocalTime.of(16, 0);
    private static final LocalTime teaEnd = LocalTime.of(21, 0);
    
    /**
     *
     * @return
     */
    public static Beverage createDrink(){
        LocalTime currentTime = LocalTime.now();
        if(currentTime.isAfter(coffeStart) && currentTime.isBefore(coffeEnd)){
            return new Coffee("Coffee");
        }else if(currentTime.isAfter(teaStart) && currentTime.isBefore(teaEnd) ){
            return new Tea("Tea");
        }else{
            return new Water("Water");
        }
    }
}
