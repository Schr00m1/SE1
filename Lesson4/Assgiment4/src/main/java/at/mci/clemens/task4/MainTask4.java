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

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Subject badUser = new Proxy();
        badUser.request("microsoft.com");
        badUser.request("youtube.com");
        badUser.request("chatgpt.com");
        System.out.println("-------------------------------");
        Subject goodUser = new Proxy();
        goodUser.request("fsfe.org");
        goodUser.request("archlinux.org");
        goodUser.request("google.at");

    }
}
