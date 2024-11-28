/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.skipass;

/**
 *
 * @author Clemens
 */
public class SeriennummerCreator {
    public static final SeriennummerCreator seriennummerCreatorInstance = new SeriennummerCreator();
    private long newId = 0;
    
    public long createId(){
        return ++this.newId;
    }
    private SeriennummerCreator(){}
}
