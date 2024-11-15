/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.task2;

/**
 *
 * @author Clemens
 */
public class FsFe extends AbstractObserver {

    @Override
    public void update(String message) {
        System.out.println("The FsFe is realising a new paper");
        System.out.println(message);
        System.out.println("Copyleft by fsfe.org");
    }
    
}
