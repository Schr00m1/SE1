/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.task4;

/**
 *
 * @author Clemens
 */
public class FamilyHouse extends BuildHouse {

    @Override
    protected void buildWalls() {
        System.out.println("We are building walls for the family House now we need to storreys");
    }

    @Override
    protected void buildRoof() {
        System.out.println("We are roofing the family house now giving it a nice roof");
    }

    @Override
    protected void insertDoorsWindows() {
        System.out.println("We are inserting windows into our family house now");
    }
    
}
