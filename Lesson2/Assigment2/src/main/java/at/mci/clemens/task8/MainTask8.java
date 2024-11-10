/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.task8;
import at.mci.clemens.task6.WrongArgumentTypeExeption;
import at.mci.clemens.task7.NegativeIntException;

/**
 *
 * @author Clemens
 */
public class MainTask8 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        OutputNrOfObjects outputter = new OutputNrOfObjects();
        try{
        outputter.outputNrOfObjects();
        }catch (IndexOutOfBounceException | NegativeIntException | WrongArgumentTypeExeption e){
            System.out.println(e);
        }
    }
}
