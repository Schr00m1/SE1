/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.assigment_1;



/**
 * Class to the the implementation of the Student class with many diffrent operations taking place
 * 
 * @author Clemens Wanker
 */
public class TestStudent {

    /**
     *Main fuction
     * @param args console arguments
     */
    public static void main(String[] args) {
        
        //Task 3 
        Student Clemens, 
                Tobias, 
                Julian, 
                Barbara, 
                Richard;
        Clemens = new Student("Klemens", "wc5754");
        Tobias = new Student("Tobias", "tm1234", "Male");
        Julian = new Student("Julian", "jk4321", "Male ","SEE");
        Barbara = new Student("Barbara", "bw0123", "Female", "SED", "good");
        Richard = new Student();
        
        
        System.out.println("*****************************************\n");
        System.out.println(Clemens.toString());
        System.out.println("*****************************************\n");
        
        Clemens.setName("Clemens");
        Clemens.setGroup("English");
        Clemens.setProficiencyInJava("Newbie");
        
        System.out.println("*****************************************\n");
        System.out.println(Clemens.toString());
        System.out.println("*****************************************\n");
        
        
        System.out.println("*****************************************\n");
        System.out.println(Tobias.toString());
        System.out.println("*****************************************\n");
        
        Tobias.setGroup("SED");
        Tobias.setStudentID("broken id");
        
        System.out.println("*****************************************\n");
        System.out.println(Tobias.toString());
        System.out.println("*****************************************\n");
        
        System.out.println("*****************************************\n");
        System.out.println(Julian.toString());
        System.out.println("*****************************************\n");
        System.out.println("Julian has the Id: " + Julian.getStudentID() + "\n");

        System.out.println("*****************************************\n");
        System.out.println(Richard.toString());
        System.out.println("*****************************************\n");
        Richard.setGender("Male");
        System.out.println("Richard has gender: " + Richard.getGender());
        Richard.setGroup("Linux User");
        Richard.setName("Richard");
        Richard.setProficiencyInJava("Good");
        Richard.setStudentID("rk1245");
        System.out.println("Richards name and id: " + Richard.getName() + Richard.getStudentID());

        System.out.println("*****************************************\n");
        System.out.println(Richard.toString());
        System.out.println("*****************************************\n");
        
        System.out.println("*****************************************\n");
        System.out.println(Barbara.toString());
        System.out.println("*****************************************\n");
        
        System.out.println("Barbara id: " + Barbara.getStudentID());
        System.out.println("Barbara gender: " + Barbara.getGender());
        System.out.println("Barbara Java Knowledge: " + Barbara.getProficiencyInJava());
        System.out.println("BarbaraGroup: " + Barbara.getGroup());
        
        
        //Now we continiu to task 4
        Clemens.setProficiencyInJava("Motivated to learn");
        Tobias.setProficiencyInJava("Motivated to learn");
        
        System.out.println("*****************************************");
        System.out.println("Do Clemens and Tobias have the same proficiency in Java?: " + Clemens.hasSameFluencyInJava(Tobias));
        System.out.println("*****************************************");
        System.out.println("Do Clemens and Barbara have the same proficiency in Java?: " + Clemens.hasSameFluencyInJava(Barbara));
        System.out.println("*****************************************");
        
        //Task 5
        
        System.out.println("*****************************************");
        System.out.println("Clemens is equal to Clemens?: " + Clemens.equals(Clemens));
        System.out.println("*****************************************");
        System.out.println("Clemens euqals Barbara?: " + Clemens.equals(Barbara));
        System.out.println("*****************************************");
        
        
        //Summer Term
        Clemens.addGrade(1);
        Clemens.addGrade(1);
        Clemens.addGrade(1);
        Clemens.addGrade(1);
        Clemens.addGrade(1);
        Clemens.addGrade(3);
       
        System.out.println("Clemens 1st semester grade averga: " + Clemens.averageNote());
        System.out.println("*****************************************");
        
        //Winter Term
        Clemens.addGrade(1);
        Clemens.addGrade(2);
        Clemens.addGrade(2);
        Clemens.addGrade(1);
        Clemens.addGrade(3);
        Clemens.addGrade(1);
        System.out.println("Clemens grade average after 2nd Semester: " + Clemens.averageNote());
    }
}
