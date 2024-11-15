/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.task3;

/**
 *
 * @author Clemens
 */
public class InsertionSort implements SortingAlg {

    /**
     *
     * @param array
     */
    @Override
    public void sortArray(int[] array) {
        int n = array.length;
        
        // Start from the second element (index 1)
        for (int i = 1; i < n; i++) {
            int key = array[i];  // Element to be inserted into sorted portion of array
            int j = i - 1;          
            // Shift elements of the sorted portion that are greater than key
            // one position to the right
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }          
            // Place the key in the correct position
            array[j + 1] = key;
        }  
    }
}
