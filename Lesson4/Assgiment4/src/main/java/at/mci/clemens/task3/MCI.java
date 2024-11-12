/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.task3;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Clemens
 */
public class MCI extends AbstractMember{
    private List <AbstractMember> members;

    /**
     *
     */
    public MCI() {
        this.members = new ArrayList<>();
    }

    /**
     *
     */
    @Override
    public void printInformation() {
        System.out.println("Printing all MCI Party Peoples");
        for (AbstractMember member : this.members){
            member.printInformation();
        }
    }

    /**
     *
     * @param member
     */
    public void addMember(AbstractMember member){
        this.members.add(member);
    }

    /**
     *
     * @param member
     */
    public void removeMember(AbstractMember member){
        this.members.remove(member);
    }
}
