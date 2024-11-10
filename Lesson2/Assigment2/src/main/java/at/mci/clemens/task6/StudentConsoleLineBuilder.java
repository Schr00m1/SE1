/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.task6;
import at.mci.clemens.task3.Student;
import at.mci.clemens.task3.TAStudent;
import at.mci.clemens.task4.PhDStudent;
import java.util.Scanner;

/**
 *
 * @author Clemens
 */
public class StudentConsoleLineBuilder {
    private int type;
    private int studentId;
    private String gender;
    private String group;
    private String javaProf;
    private  String supportTask;
    private String hasDegreein;
    private String doesPhdIn;
    private String name;
    private Student newStudent;

    
    public Student readConsoleLineInput() throws WrongArgumentTypeExeption, NoIdException, NoNameException{
        
        Scanner inputReader = new Scanner(System.in);
        while(true){

                System.out.println("What Type of student do you want to create? \n  1=Normal 2=TA 3=PhD: ");
                if(inputReader.hasNextInt()){
                    switch (inputReader.nextInt()) {
                        case 1 -> {
                            this.newStudent = new Student();
                            this.type = 1;
                        }
                        case 2 -> {
                            this.newStudent= new TAStudent();
                            this.type = 2;
                        }
                        case 3 -> {
                            this.newStudent = new PhDStudent();
                            this.type = 3;
                        }
                        default -> {
                        }
                    }
                    inputReader.nextLine();
                }else{
                    throw new WrongArgumentTypeExeption("No int inputet for selecting type of student");
                }
  
                
                System.out.println("Please enter the Student Id:");
                 if(inputReader.hasNextInt()){
                     this.studentId = inputReader.nextInt();
                      inputReader.nextLine();
                 }else{
                     throw new WrongArgumentTypeExeption("No int inputet for Student ID");
                 }
              
                 System.out.println("Please enter the name: ");
                this.name = inputReader.nextLine();
                 System.out.println("Please enter gender: ");
                 this.gender = inputReader.nextLine();
                 System.out.println("Please enter group:");
                 this.group = inputReader.nextLine();
                 System.out.println("Please enter Proficiency in Java:: ");
                 this.javaProf = inputReader.nextLine();
                 switch(this.type){
                     case 1 ->{
                     }
                     case 2 ->{
                         System.out.println("Please enter Support Task:");
                         this.supportTask = inputReader.nextLine();
                         TAStudent newta = (TAStudent) this.newStudent;
                          if(this.supportTask != null && !this.supportTask.isEmpty()){newta.setSupportTask(this.supportTask);}
                          this.newStudent = newta;
                         
                     }
                     case 3 ->{
                         System.out.println("Please enter Support Task:");
                         this.supportTask = inputReader.nextLine();
                         PhDStudent newphd= (PhDStudent) this.newStudent;
                          if(this.supportTask != null && !this.supportTask.isEmpty()){newphd.setSupportTask(this.supportTask);}
                          
                          System.out.println("Please enter the master: ");
                          this.hasDegreein = inputReader.nextLine();
                          if(this.hasDegreein != null && !this.hasDegreein.isEmpty()){newphd.setHasDegreeIn(this.hasDegreein);}
                          
                          System.out.println("Please enter the PhD Topic: ");
                          this.doesPhdIn = inputReader.nextLine();
                          if(this.doesPhdIn != null && !this.doesPhdIn.isEmpty()){newphd.setDoesPhDIn(this.doesPhdIn);}
                          this.newStudent = newphd;
                     }
                 }
                  if(this.name != null && !this.name.isEmpty()){
                         this.newStudent.setName((this.name));
                         }else{
                             throw new NoNameException("NO name was given to student");
                         }
                this.newStudent.setStudentID(this.studentId);
                if(this.gender != null && !this.gender.isEmpty()){this.newStudent.setGender(this.gender);}
                if(this.group != null && !this.group.isEmpty()){this.newStudent.setGroup(this.group);}
                if(this.javaProf != null && !this.javaProf.isEmpty()){this.newStudent.setProficiencyInJava(this.javaProf);}
                break;
            }  
        return this.newStudent;
     }
        
       
}
    

