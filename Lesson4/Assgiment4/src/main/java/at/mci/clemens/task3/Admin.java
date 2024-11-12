/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.task3;

/**
 *
 * @author Clemens
 */
public class Admin extends AbstractMember{
    
    private String name;
    private String department;
    private String speciality;

    /**
     *
     * @param name
     * @param department
     * @param speciality
     */
    public Admin(String name, String department, String speciality) {
        this.name = name;
        this.department = department;
        this.speciality = speciality;
    }
    
    /**
     *
     */
    @Override
    public void printInformation() {
        System.out.println("I am an admin at the " + this.department + " my name is " + this.name +  " and i specialize in " + this.speciality);
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getDepartment() {
        return department;
    }

    /**
     *
     * @param department
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     *
     * @return
     */
    public String getSpeciality() {
        return speciality;
    }

    /**
     *
     * @param speciality
     */
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    
}
