/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02;
import java.util.ArrayList;
import java.util.Collections;
public class task6 {
    public static void main(String[] args) {
        // Initialize two ArrayLists with some elements
        ArrayList<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, 1, 3, 5, 7, 9);

        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 2, 4, 6, 8, 10);

        // Merge both ArrayLists
        ArrayList<Integer> mergedList = mergeLists(list1, list2);

        // Display the merged ArrayList
        System.out.println("Merged ArrayList: " + mergedList);
    }

    public static ArrayList<Integer> mergeLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        // Create a new ArrayList to hold the merged elements
        ArrayList<Integer> mergedList = new ArrayList<>(list1);

        // Add all elements from the second list
        mergedList.addAll(list2);

        return mergedList;
    }
}


