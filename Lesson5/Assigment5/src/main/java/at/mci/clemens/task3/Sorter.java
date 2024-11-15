/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.task3;

/**
 *
 * @author Clemens
 */
public class Sorter {
    private SortingAlg sortingAlg;
    
    public void setSortingAlgorithm(SortingAlg algo){
        this.sortingAlg = algo;
    }
    public void sort(int array[]){
        if(this.sortingAlg != null){
             this.sortingAlg.sortArray(array);
        }
    }
}
