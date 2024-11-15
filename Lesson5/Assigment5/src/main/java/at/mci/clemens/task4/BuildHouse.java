/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.task4;

/**
 *
 * @author Clemens
 */
public abstract class BuildHouse {
    public final void buildHouse(){
        buildFoundation();
        buildWalls();
        buildRoof();
        insertDoorsWindows();
    }
    
    //building the foundation is same for all houses
    private void buildFoundation(){
        System.out.println("We are building the foundation now");
    }
    protected abstract void buildWalls();
    protected abstract void buildRoof();
    protected abstract void insertDoorsWindows();
}
