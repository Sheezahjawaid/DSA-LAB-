/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02;
 import java.util.*;
public class hometask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string to get its hash code:");
        String userInput = scanner.nextLine();

        // Get hash code of the input
        int hashCode = userInput.hashCode();

        // Display the hash code
        System.out.println("Hash code of the input \"" + userInput + "\" is: " + hashCode);

        scanner.close();
    }
}


