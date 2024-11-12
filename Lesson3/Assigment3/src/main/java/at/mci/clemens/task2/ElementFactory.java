/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.task2;

/**
 *
 * @author Clemens
 */
public class ElementFactory {

    /**
     *
     * @param num
     * @param name
     * @param symbol
     * @return
     * @throws PeriodicNumOutOfRangeException
     * @throws WrongSymbolException
     */
    public static Element createElement(int num, String name, String symbol) 
                                                                             throws PeriodicNumOutOfRangeException, WrongSymbolException{
        if(num < 1 || num  > 118){
            throw new PeriodicNumOutOfRangeException("The periodic Element you want to add wasnt discovered Yet");
        }
        if (symbol.length() < 0 || symbol.length()  > 2){
            throw new WrongSymbolException("Symbol cant be empty or longer than two chars");
        }
        return new Element(num, name, symbol);
    }
}
