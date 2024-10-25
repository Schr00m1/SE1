/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.Exercise1.Clemens;

import java.util.ArrayList;

/**
 * Represents a student with details such as name, student ID, gender, group, and proficiency in Java.
 * 
 * The class keeps track of the number of student instances created.
 * 
 * 
 * Fields:
 * <ul>
 * <li>{@code name}: The name of the student.</li>
 * <li>{@code group}: The group that the student is part of.</li>
 * <li>{@code proficiencyInJava}: The student's proficiency level in Java.</li>
 * <li>{@code studentID}: The unique identifier for the student.</li>
 * <li>{@code gender}: The gender of the student.</li>
 * <li>{@code numberOfStundents}: The amount of all students as static variable</li>
 * <li>{@code  grades}: A list for all the grades a student has achieved (as int since MCI uses int</li>
 * </ul>
 * 
 * @author Clemens Wanker
 * 
 */
public class Student {

    private String name;
    private String group;
    private String proficiencyInJava;
    private String studentID;
    private String gender;
    private static int numberOfStudents;
    private ArrayList<Integer> grades;

    /**
     *Standard constructor which also adds the amount of all students
     */
    public Student() {
        numberOfStudents++;
        this.grades = new ArrayList<>();
        System.out.println("New Student added! There are a total of " + numberOfStudents + " students");
    }

    /**
     *
     * @param studentID The stundent ID as parameter
     */
    public Student(String studentID) {
        this();
        this.studentID = studentID;      
    }

    /**
     *
     * @param name Name of the student as parameter
     * @param studentID The stundent ID as parameter
     */
    public Student(String name, String studentID) {
        this(studentID);
        this.name = name;  
    }

    /**
     *
     * @param name Name of the student as parameter
     * @param studentID The stundent ID as parameter
     * @param gender The gender of the student as parameter 
     */
    public Student(String name, String studentID, String gender) {
        this(name, studentID);
        this.gender = gender;
    }

    /**
     *
     * @param name Name of the student as parameter
     * @param studentID The stundent ID as parameter
     * @param gender The gender of the student as parameter 
     * @param group The group of the student as parameter 
     */
    public Student(String name, String studentID, String gender, String group) {
        this(name, studentID, gender);
        this.group = group;
    }

    /**
     *
     * @param name Name of the student as parameter
     * @param studentID The stundent ID as parameter
     * @param gender The gender of the student as parameter 
     * @param group The group of the student as parameter 
     * @param proficiencyInJava The Knowledge a student has in java of the student as parameter 
     */
    public Student(String name, String studentID, String gender, String group, String proficiencyInJava) {
        this(name, studentID, gender, group);
        this.proficiencyInJava = proficiencyInJava;
    }

    /**
     *For printing the stundent
     * 
     * @return  String returns all parameter of the student as string
     */
    @Override
    public String toString() {
        return "Student [name = " + name + ", group = " + group + ", proficiency in Java = " + proficiencyInJava + ", Student ID= " + studentID + ", gender = " + gender + "]";
    }

    /**
     *Gets the name of the student
     * 
     * @return String name
     */
    public String getName() {
        return name;
    }

    /**
     *Set the name of student
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for group
     * 
     * @return string group
     */
    public String getGroup() {
        return group;
    }

    /**
     *Sets the group of the student
     * 
     * @param group
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     *Gets the proficiency in java
     * 
     * @return string proficiencyInJava
     */
    public String getProficiencyInJava() {
        return proficiencyInJava;
    }

    /**
     * Set the proficiency in java for a student
     * @param proficiencyInJava
     */
    public void setProficiencyInJava(String proficiencyInJava) {
        this.proficiencyInJava = proficiencyInJava;
    }

    /**
     *getter for stundent id
     * @return string studentID
     */
    public String getStudentID() {
        return studentID;
    }

    /**
     * Set the Student id of a stundent
     * @param studentID
     */
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    /**
     * Getter for the gender of student
     * @return String gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Set the gender of a stundent
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    //Task 4

    /**
     * Check if calling student has the same proficiency in jave as the student passed as parameter
     * @param anotherStudent student that is compared with calling stundent
     * @return returns {@code true} if they have same proficiency else returns {@code false} 
     */ 
    public boolean hasSameFluencyInJava(Student anotherStudent) {
        return this.proficiencyInJava.equals(anotherStudent.getProficiencyInJava());
    }

    //Task 5

    /**
     * Checks if the calling Object is the same as the passed Object
     * @param obj The object to be compared with the calling one
     * @return  return {@code true} if they are equal else returns {@code false}
     */  
    @Override
    public boolean equals(Object obj) {
        return (this == obj);
    }
    
    /**
     * Adds a new grade to the student
     * @param grade The grade you want to add
     */
    public void addGrade(int grade){
        this.grades.add(grade);
    }
    
    /**
     * Returns the average Grade of a Student
     * @return float the average grade
     */
    public float averageNote(){
        float sum = 0;
        for(int grade : this.grades){
            sum+=grade;
        }
        return sum/this.grades.size();
    }

    
    
}
