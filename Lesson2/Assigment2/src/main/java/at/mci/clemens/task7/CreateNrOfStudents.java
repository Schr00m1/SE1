/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.task7;
import at.mci.clemens.task3.Student;
import at.mci.clemens.task6.*;
import java.util.Scanner;

/**
 *
 * @author Clemens
 */
public class CreateNrOfStudents  {
    private Student[] students;
    private int amountOfStudents;
    
    public Student[] createNrOfStudents() throws WrongArgumentTypeExeption, NegativeIntException{
             Scanner inputReader = new Scanner(System.in);
            System.out.println("How many students to you want to creates?: ");
            if(inputReader.hasNextInt()){
                        this.amountOfStudents = inputReader.nextInt();
                        if(this.amountOfStudents < 0){
                            throw new NegativeIntException("Cant create a negative number of Students");
                        }
                        this.students = new Student[this.amountOfStudents];
                        //Clear cached \n
                        inputReader.nextLine();
                        
             }else{
                        throw new WrongArgumentTypeExeption("No right amount of students given!");
             }
            StudentConsoleLineBuilder bob = new StudentConsoleLineBuilder();
            for(int i = 0; i < this.amountOfStudents; i++){
                        try{
                                    this.students[i] = bob.readConsoleLineInput();
                        }
                        catch(NoIdException | NoNameException | WrongArgumentTypeExeption e){
                                    System.out.println(e);
                                    //try creating the same stundent again
                                    i -= 1;
                        }
             }           
                        
            return this.students;
    }
    public static void main(String[] args) {
        CreateNrOfStudents creator = new CreateNrOfStudents();
        Student[] mystudents = null;
        try{
            mystudents = creator.createNrOfStudents();
        }catch(WrongArgumentTypeExeption e){
            System.out.println(e);
        }
        for(int i = 0; i < mystudents.length; i++){
            System.out.println(mystudents[i].toString());
        }
    }
}
