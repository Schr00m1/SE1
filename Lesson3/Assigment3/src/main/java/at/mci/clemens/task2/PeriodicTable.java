/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.task2;

/**
 *
 * @author Clemens
 */
public class PeriodicTable {

    /**
     *
     */
    public static final PeriodicTable C_INSTANCE = new PeriodicTable();
    private final Element[] elements = new Element[118];
    
    private PeriodicTable(){}
    
    /**
     *
     * @param num
     * @param name
     * @param symbol
     * @return
     */
    public Element addElement(int num, String name, String symbol){
        //Acount for 0 indexing
        num = num-1; 
        if(num < 118 && num > 0 && this.elements[num] != null){
            return this.elements[num];
        }else{
            try{
                Element e = ElementFactory.createElement(num+1, name, symbol);
                this.elements[num] = e;
                return this.elements[num];
            }catch(PeriodicNumOutOfRangeException | WrongSymbolException e){
                System.out.println("Couldnt create Element because" + e + " returning NULL");
                return null;
            }
        }
    }

    /**
     *
     * @param num
     * @throws PeriodicNumOutOfRangeException
     */
    public void printElement(int num) throws PeriodicNumOutOfRangeException{
        //Account for 0 indexing
        num = num -1;
        if(this.elements[num] == null){
            throw new PeriodicNumOutOfRangeException("You cant print an element thats not added yet");
        }else{
            System.out.println((this.elements[num].toString()));
        }
    }

    /**
     *
     */
    public void printAllElements(){
        for(int i = 0; i  < 118; i++){
            if(this.elements[i] != null){
                System.out.println(this.elements[i].toString());
            }
        }
    }
}
