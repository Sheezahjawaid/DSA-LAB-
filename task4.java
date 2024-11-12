
package lab02;
import java.util.Vector;
public class task4 {
    public static void main(String[] args) {
        // Initialize a Vector with 10 integers
        Vector<Integer> numbers = new Vector<>();
        
        // Add 10 integers to the Vector
        numbers.add(12);
        numbers.add(7);
        numbers.add(19);
        numbers.add(4);
        numbers.add(11);
        numbers.add(23);
        numbers.add(8);
        numbers.add(5);
        numbers.add(16);
        numbers.add(9);

        // Display all integers in the Vector
        System.out.println("Vector elements: " + numbers);

        // Calculate the sum of integers in the Vector
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of Vector elements: " + sum);

        // Find the maximum element in the Vector
        int max = numbers.get(0); // Initialize with the first element
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum element in Vector: " + max);
    }
}


