/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.task4;

/**
 *
 * @author Clemens
 */
public class RealSubject extends Subject{
    
    /**
     *
     * @param webAddress
     */
    @Override
    public void request(String webAddress) {
        System.out.println("Connecting to the Server " + webAddress + " since my proxy allowed to");
    }
}
