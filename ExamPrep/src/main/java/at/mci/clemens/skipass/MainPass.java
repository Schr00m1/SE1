/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.skipass;

/**
 *
 * @author Clemens
 */
public class MainPass {
    public static void main(String[] args) {
        SkipassKassa myKassa = new SkipassKassa();
        Skipass childpass = myKassa.kaufen(12, 0, 20);
        System.out.println(childpass.toString());
        System.out.println("Chilpass should not be valid" + childpass.istGueltig(25));
 
        System.out.println("----------------------------------------------------");
        
        Skipass dadPass = myKassa.kaufen(35, 10, 20);
        System.out.println(dadPass.toString());
        System.out.println("Shuld be valid" + dadPass.istGueltig(28));
        
        System.out.println("----------------------------------------------------");
        
        Skipass grandmaPass = myKassa.kaufen(70, 0, 35);
        System.out.println(grandmaPass.toString());
        System.out.println("Sould be valid" + grandmaPass.istGueltig(35));
    }
}
