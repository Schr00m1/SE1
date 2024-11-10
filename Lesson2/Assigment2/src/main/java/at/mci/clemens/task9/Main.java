/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.task9;

/**
 *
 * @author Clemens
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        TheBestDivisionHandler ceaser = new TheBestDivisionHandler();
        try{
            ceaser.divideNumbers();
        }catch (NumberFormatException | ArithmeticException e){
            System.out.println(e);
        }
    }
}
