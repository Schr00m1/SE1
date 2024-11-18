/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.task4;

/**
 *
 * @author Clemens
 */
public class MainTask4 {
    public static void main(String[] args) {
        BuildHouse familyHome = new FamilyHouse();
        familyHome.buildHouse();
        System.out.println("----------------------------------------------------------");
        BuildHouse skyscraper = new SkyScraper();
        skyscraper.buildHouse();
    }
}
