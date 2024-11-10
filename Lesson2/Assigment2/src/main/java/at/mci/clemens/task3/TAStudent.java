/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.task3;


/**
 *
 * @author Clemens
 */
public class TAStudent extends Student {
    private String supportTask;

    /**
     *
     */
    public TAStudent() {
        super();
    }

    /**
     *
     * @param studentID
     */
    public TAStudent(int studentID) {
        super(studentID);
    }

    /**
     *
     * @param name
     * @param studentID
     */
    public TAStudent(String name, int studentID) {
        super(name, studentID);
    }

    /**
     *
     * @param name
     * @param studentID
     * @param gender
     */
    public TAStudent(String name, int studentID, String gender) {
        super(name, studentID, gender);
    }

    /**
     *
     * @param name
     * @param studentID
     * @param gender
     * @param group
     */
    public TAStudent(String name, int studentID, String gender, String group) {
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
    public TAStudent(String name, int studentID, String gender, String group, String proficiencyInJava) {
        super(name, studentID, gender, group, proficiencyInJava);
    }
    
    /**
     *
     * @param name
     * @param studentID
     * @param gender
     * @param group
     * @param proficiencyInJava
     * @param supportTask
     */
    public TAStudent(String name, int studentID, String gender, String group, String proficiencyInJava, String supportTask) {
        super(name, studentID, gender, group, proficiencyInJava);
        this.supportTask = supportTask;
    }

    /**
     *
     * @return
     */
    public String getSupportTask() {
        return supportTask;
    }

    /**
     *
     * @param supportTask
     */
    public void setSupportTask(String supportTask) {
        this.supportTask = supportTask;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return  super.toString() + " supportTask " + this.supportTask;
    }
 

}
