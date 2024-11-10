/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.task9;

import java.util.Scanner;

/**
 *
 * @author Clemens
 */
public class TheBestDivisionHandler {
private int a;
private int b;   

    /**
     *
     * @throws NumberFormatException
     * @throws ArithmeticException
     */
    public void divideNumbers() throws NumberFormatException, ArithmeticException{
        System.out.println("Enter First number?: ");
        Scanner inputReader = new Scanner(System.in);
         if(inputReader.hasNextInt()){
                        this.a = inputReader.nextInt();
        }else{
            throw new NumberFormatException("You need to enter an int");
        }
         //clear cached \n
         inputReader.nextLine();
         System.out.println("Enter Second number");
            if(inputReader.hasNextInt()){
                        this.b = inputReader.nextInt();
                        if (this.b == 0){
                            throw new ArithmeticException("You cant devide through 0");
                        }
        }else{
            throw new NumberFormatException("You need to enter an int");
        }
        System.out.println("The Result of the division is: " + (float) a/b);
    }
}
