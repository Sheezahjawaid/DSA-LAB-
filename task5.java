/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02;
import java.util.ArrayList;
import java.util.Collections;
public class task5 {

    public static void main(String[] args) {
        // Initialize a sorted ArrayList
        ArrayList<Integer> sortedList = new ArrayList<>();
        Collections.addAll(sortedList, 2, 4, 7, 10, 15, 20, 25, 30, 35, 40); // Assume it's sorted

        int k = 5; // Find the 5th smallest element
        int kthSmallest = findKthSmallest(sortedList, k);

        if (kthSmallest != -1) {
            System.out.println("The " + k + "-th smallest element is: " + kthSmallest);
        } else {
            System.out.println("Invalid value of k.");
        }
    }

    public static int findKthSmallest(ArrayList<Integer> list, int k) {
        // Check if k is within the bounds of the list size
        if (k > 0 && k <= list.size()) {
            return list.get(k - 1); // Return the (k-1)th element (1-based index)
        } else {
            return -1; // Invalid k
        }
    }
}


