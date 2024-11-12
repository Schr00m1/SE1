/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.task3;

/**
 *
 * @author Clemens
 */
public class TechnicalStaff extends AbstractMember{
    private String name;
    private String department;
    private int accessLevel;

    /**
     *
     * @param name
     * @param department
     * @param accessLevel
     */
    public TechnicalStaff(String name, String department, int accessLevel) {
        this.name = name;
        this.department = department;
        this.accessLevel = accessLevel;
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
    public int getAccessLevel() {
        return accessLevel;
    }

    /**
     *
     * @param accessLevel
     */
    public void setAccessLevel(int accessLevel) {
        this.accessLevel = accessLevel;
    }

    /**
     *
     */
    @Override
    public void printInformation() {
        System.out.println("I am an Technical worker named: " + this.name + " i work for the department " + this.department + " and have access rights lvl: " + this.accessLevel);
    }
    
    
}
