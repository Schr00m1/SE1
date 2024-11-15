/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.task3;

/**
 *
 * @author Clemens
 */
public class MergeSort implements SortingAlg {

    /**
     *
     * @param array
     */
    @Override
    public void sortArray(int[] array) {
        if (array.length < 2) {
            return; // Base case: Array of size 1 or empty
        }

        // Split the array into two halves
        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        // Copy data into the left and right arrays
        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, array.length - mid);

        // Recursively sort both halves
        sortArray(left);
        sortArray(right);

        // Merge the sorted halves
        merge(array, left, right);
    }

    // Method to merge two sorted arrays into the original array

    /**
     *
     * @param array
     * @param left
     * @param right
     */
    public static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Merge the two arrays while comparing elements
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        // Copy any remaining elements of the left array
        while (i < left.length) {
            array[k++] = left[i++];
        }

        // Copy any remaining elements of the right array
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }
}
    

