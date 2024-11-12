/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.task3;

/**
 *
 * @author Clemens
 */
public class Employee extends AbstractMember{
    
    private String name;
    private int employeeId;

    /**
     *
     * @param name
     * @param employeeId
     */
    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }
    
    /**
     *
     */
    @Override
    public void printInformation() {
        System.out.println("I am a employee and my name is " + this.name + " my id is " + this.employeeId);
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
    public int getEmployeeId() {
        return employeeId;
    }

    /**
     *
     * @param employeeId
     */
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
       
}
