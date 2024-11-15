/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.task2;

/**
 *
 * @author Clemens
 */
public class TirolienDayPaper extends AbstractObserver {

    @Override
    public void update(String message) {
        System.out.println("TTT is Publishing a new paper");
        System.out.println(message);
        System.out.println("Copyright by TTT");
    }
    
}
