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
public class PhDStudent extends TAStudent {
    private String hasDegreeIn;
    private String doesPhDIn;

    /**
     *
     */
    public PhDStudent() {
    }

    /**
     *
     * @param studentID
     */
    public PhDStudent(int studentID) {
        super(studentID);
    }

    /**
     *
     * @param name
     * @param studentID
     */
    public PhDStudent(String name, int studentID) {
        super(name, studentID);
    }

    /**
     *
     * @param name
     * @param studentID
     * @param gender
     */
    public PhDStudent(String name, int studentID, String gender) {
        super(name, studentID, gender);
    }

    /**
     *
     * @param name
     * @param studentID
     * @param gender
     * @param group
     */
    public PhDStudent(String name, int studentID, String gender, String group) {
        super(name, studentID, gender, group);
    }

    /**
     *
     * @param name
     * @param studentID
     * @param gender
     * @param group
     * @param proficiencyInJava
     */
    public PhDStudent(String name, int studentID, String gender, String group, String proficiencyInJava) {
        super(name, studentID, gender, group, proficiencyInJava);
    }

    /**
     *
     * @param hasDegreeIn
     * @param name
     * @param studentID
     * @param gender
     * @param group
     * @param proficiencyInJava
     * @param supportTask
     */
    public PhDStudent(String hasDegreeIn, String name, int studentID, String gender, String group, String proficiencyInJava, String supportTask) {
        super(name, studentID, gender, group, proficiencyInJava, supportTask);
        this.hasDegreeIn = hasDegreeIn;
    }

    /**
     *
     * @param hasDegreeIn
     * @param doesPhDIn
     * @param name
     * @param studentID
     * @param gender
     * @param group
     * @param proficiencyInJava
     * @param supportTask
     */
    public PhDStudent(String hasDegreeIn, String doesPhDIn, String name, int studentID, String gender, String group, String proficiencyInJava, String supportTask) {
        super(name, studentID, gender, group, proficiencyInJava, supportTask);
        this.hasDegreeIn = hasDegreeIn;
        this.doesPhDIn = doesPhDIn;
    }

    /**
     *
     * @return
     */
    public String getHasDegreeIn() {
        return hasDegreeIn;
    }

    /**
     *
     * @param hasDegreeIn
     */
    public void setHasDegreeIn(String hasDegreeIn) {
        this.hasDegreeIn = hasDegreeIn;
    }

    /**
     *
     * @return
     */
    public String getDoesPhDIn() {
        return doesPhDIn;
    }

    /**
     *
     * @param doesPhDIn
     */
    public void setDoesPhDIn(String doesPhDIn) {
        this.doesPhDIn = doesPhDIn;
    }

    @Override
    public String toString() {
        return  super.toString() +  "hasDegreeIn=" + hasDegreeIn + ", doesPhDIn=" + doesPhDIn;
    }
    
    /**
     *
     */
    public void studyForPhd(){
        System.out.println("Student" + this.getName() + " is currently working hard on studying for his PhD in " + this.getDoesPhDIn());
    }
  
}
