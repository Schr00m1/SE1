/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.task4;

import at.mci.clemens.task3.TAStudent;

/**
 *
 * @author Clemens
 * we can extend TAStudent since PhDStudent also has the teaching support and else only extra parameters 
 */
public class PhDSrudent extends TAStudent {
    private String hasDegreeIn;
    private String doesPhDIn;

    public PhDSrudent() {
    }

    public PhDSrudent(int studentID) {
        super(studentID);
    }

    public PhDSrudent(String name, int studentID) {
        super(name, studentID);
    }

    public PhDSrudent(String name, int studentID, String gender) {
        super(name, studentID, gender);
    }

    public PhDSrudent(String name, int studentID, String gender, String group) {
        super(name, studentID, gender, group);
    }

    public PhDSrudent(String name, int studentID, String gender, String group, String proficiencyInJava) {
        super(name, studentID, gender, group, proficiencyInJava);
    }

    public PhDSrudent(String hasDegreeIn, String name, int studentID, String gender, String group, String proficiencyInJava, String supportTask) {
        super(name, studentID, gender, group, proficiencyInJava, supportTask);
        this.hasDegreeIn = hasDegreeIn;
    }

    public PhDSrudent(String hasDegreeIn, String doesPhDIn, String name, int studentID, String gender, String group, String proficiencyInJava, String supportTask) {
        super(name, studentID, gender, group, proficiencyInJava, supportTask);
        this.hasDegreeIn = hasDegreeIn;
        this.doesPhDIn = doesPhDIn;
    }

    public String getHasDegreeIn() {
        return hasDegreeIn;
    }

    public void setHasDegreeIn(String hasDegreeIn) {
        this.hasDegreeIn = hasDegreeIn;
    }

    public String getDoesPhDIn() {
        return doesPhDIn;
    }

    public void setDoesPhDIn(String doesPhDIn) {
        this.doesPhDIn = doesPhDIn;
    }

    @Override
    public String toString() {
        return  super.toString() +  "hasDegreeIn=" + hasDegreeIn + ", doesPhDIn=" + doesPhDIn;
    }
    
    public void studyForPhd(){
        System.out.println("Student" + this.getName() + " is currently working hard on studying for his PhD in " + this.getDoesPhDIn());
    }
  
}
