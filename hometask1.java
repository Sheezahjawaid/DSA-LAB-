/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02;
import java.util.*;
public class hometask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Integer> numbers = new Vector<>();

        // Input integers into the Vector
        System.out.println("Enter numbers for the Vector (type 'done' to finish):");
        while (scanner.hasNextInt()) {
            numbers.add(scanner.nextInt());
        }

        // Sort the Vector
        Collections.sort(numbers);

        // Display the sorted Vector
        System.out.println("Sorted Vector: " + numbers);

        // Display the largest number
        int largest = numbers.lastElement(); // Last element in a sorted Vector
        System.out.println("Largest number: " + largest);

        // Display the smallest number
        int smallest = numbers.firstElement(); // First element in a sorted Vector
        System.out.println("Smallest number: " + smallest);
        
        scanner.close();
    }
}


