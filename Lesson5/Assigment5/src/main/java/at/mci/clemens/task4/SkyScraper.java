/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.task4;

/**
 *
 * @author Clemens
 */
public class SkyScraper extends BuildHouse {

    @Override
     protected void buildWalls() {
        System.out.println("Building walls for skyscraper thats gonna take some time");
    }

    @Override
     protected void buildRoof() {
        System.out.println("Building roof for skyscraper: What a relief that those high walls a re done");
    }

    @Override
    protected void insertDoorsWindows() {
        System.out.println("Now only many windows to do pew pew");
    }
    
}
