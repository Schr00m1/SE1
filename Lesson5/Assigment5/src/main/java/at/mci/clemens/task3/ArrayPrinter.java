/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.task3;

/**
 *
 * @author Clemens
 */
public class ArrayPrinter {
    // Method to print the elements of an array

    /**
     *
     * @param array
     */
    public static void printArray(int[] array) {
        // Check if the array is null
        if (array == null) {
            System.out.println("Array is null");
            return;
        }
        // Loop through the array and print each element
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // To print a new line after the array
    }
}
