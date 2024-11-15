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
        int array[] = {40, 51, 5, 40, 80, 13, 47, 41, 44, 48, 43, 34, 68, 91, 89, 51, 52, 50, 37, 71};
        Sorter mySorter = new Sorter();
        mySorter.setSortingAlgorithm(new BubbleSort());
        System.out.println("Array before");
        ArrayPrinter.printArray(array);
        mySorter.sort(array);
        System.out.println("Array afer");
        ArrayPrinter.printArray(array);
        
        System.out.println("----------------------------------------------------------");
       int array2[] = {40, 51, 5, 40, 80, 13, 47, 41, 44, 48, 43, 34, 68, 91, 89, 51, 52, 50, 37, 71};
       mySorter.setSortingAlgorithm(new InsertionSort());
        System.out.println("Array before Insertion Sort");
        ArrayPrinter.printArray(array2);
       mySorter.sort(array2);
        System.out.println("Array after Insertion Sort");
        ArrayPrinter.printArray(array2);
        
        System.out.println("--------------------------------------------------------");
         int array3[] = {40, 51, 5, 40, 80, 13, 47, 41, 44, 48, 43, 34, 68, 91, 89, 51, 52, 50, 37, 71};
         mySorter.setSortingAlgorithm(new MergeSort());
         System.out.println("Array before MergeSort");
         ArrayPrinter.printArray(array3);
         mySorter.sort(array3);
         System.out.println("Array after Merge Sort");
         ArrayPrinter.printArray(array3);
         
         System.out.println("-----------------------------------------------------------");
         int array4[] = {40, 51, 5, 40, 80, 13, 47, 41, 44, 48, 43, 34, 68, 91, 89, 51, 52, 50, 37, 71};
         mySorter.setSortingAlgorithm(new SelectionSort());
         System.out.println("Array before Selection Sort");
         ArrayPrinter.printArray(array4);
         mySorter.sort(array4);
         System.out.println("Array after Selection Sort");
         ArrayPrinter.printArray(array4);
    }
}
