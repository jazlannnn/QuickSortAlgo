/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksortalgorithm;

import java.util.Scanner;

/**
 *
 * @author Jazlan
 */
public class QuickSortAlgorithm {


    // Method to perform QuickSort
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) { // Check if the lower index is less than the higher index
            int pi = partition(array, low, high); // Partition the array and get the pivot index
            quickSort(array, low, pi - 1); // Recursively sort the elements before the partition
            quickSort(array, pi + 1, high); // Recursively sort the elements after the partition
        }
    }

    // Method to partition the array
    private static int partition(int[] array, int low, int high) {
        int pivot = array[high]; // Choose the last element as the pivot (one of the common pivot selection strategies because of its Simplicity and Avoiding Worst Case for Already Sorted Arrays)
        int i = (low - 1); // Initialize the smaller element index
        for (int j = low; j < high; j++) { // Iterate through the array
            if (array[j] < pivot) { // If the current element is less than the pivot
                i++; // Increment the index of the smaller element
                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        // Swap array[i+1] and array[high] (or pivot)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1; // Return the partition index
    }

    // Main method to test the QuickSort
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input
        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt(); // Read the number of elements
        int[] array = new int[n]; // Create an array of size n
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) { // Read the elements from the user
            array[i] = scanner.nextInt();
        }

        quickSort(array, 0, n - 1); // Call the quickSort method

        System.out.println("Sorted array:");
        for (int i = 0; i < array.length; i++) { // Print the sorted array using a traditional for loop
            System.out.print(array[i] + " ");
        }
        scanner.close(); // Close the scanner
    }
}