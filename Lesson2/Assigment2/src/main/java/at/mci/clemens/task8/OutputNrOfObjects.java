/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.task8;
import at.mci.clemens.task7.NegativeIntException;
import at.mci.clemens.task7.CreateNrOfStudents;
import at.mci.clemens.task3.Student;
import at.mci.clemens.task6.WrongArgumentTypeExeption;
import at.mci.clemens.task6.WrongArgumentTypeExeption;
import java.util.Scanner;

/**
 *
 * @author Clemens
 */
public class OutputNrOfObjects {
    
    private int amountOfStudents;    
    
    /**
     *
     * @throws NegativeIntException
     * @throws IndexOutOfBounceException
     * @throws WrongArgumentTypeExeption
     */
    public void outputNrOfObjects() throws NegativeIntException, IndexOutOfBounceException, WrongArgumentTypeExeption{
        Student[] students = null;
        CreateNrOfStudents creator = new CreateNrOfStudents();
        try{
        students = creator.createNrOfStudents();
        } catch (WrongArgumentTypeExeption | NegativeIntException e) {
            System.out.println(e);
        }
        System.out.println("How many students do you want to print?: ");
        Scanner inputReader = new Scanner(System.in);
         if(inputReader.hasNextInt()){
                        this.amountOfStudents = inputReader.nextInt();
                        if(this.amountOfStudents < 0){
                            throw new NegativeIntException("Cant print a negative number of Students");
                        }
          }else{
             throw new WrongArgumentTypeExeption("You need to input an integer!");
         }
         if (this.amountOfStudents > students.length){
             throw new IndexOutOfBounceException("You cant print more students than you created");
         }
         for(int i = 0; i < students.length; i++){
             System.out.println("Information about Student Nr: " + i);
             System.out.println(students[i].toString());
             System.out.println("-----------------------------------------");
         }
    }
    
}
