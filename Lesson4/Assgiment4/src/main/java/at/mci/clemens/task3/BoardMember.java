/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.task3;

/**
 *
 * @author Clemens
 */
public class BoardMember extends AbstractMember{
    private String name;
    private String department;
    
    /**
     *
     * @param name
     * @param department
     */
    public BoardMember(String name, String department){
        this.name = name;
        this.department = department;
    }
    
    /**
     *
     */
    @Override
    public void printInformation() {
        System.out.println("I am  " + this.name + " I am a board memeber of the " + this.department);
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
    
}
