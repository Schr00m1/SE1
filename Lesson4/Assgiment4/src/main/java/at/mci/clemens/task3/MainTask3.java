/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.task3;

/**
 *
 * @author Clemens
 */
public class MainTask3 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        MCI mci =  new MCI();
        mci.addMember(new Resercher("jochen", "DIbsE"));
        mci.addMember(new Employee("Clemens", 12));
        mci.printInformation();
        
        BoardMember rudolf = new BoardMember("Rudolf", "MCI");
        mci.addMember(rudolf);
        rudolf.printInformation();
        Admin clemens = new Admin("Clemens",  "DiBSE", "SE");
        mci.addMember(clemens);
        mci.addMember(new TechnicalStaff("Alex", "McIT", 3));
        mci.addMember(new Admin("Steffan", "GWM", "IT"));
        System.out.println("----------------------------------------");
        mci.printInformation();
        System.out.println("------------------------------------------");
        
        mci.removeMember(rudolf);
        mci.printInformation();
    }
}
