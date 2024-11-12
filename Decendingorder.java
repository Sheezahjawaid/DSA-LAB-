
import java.util.Scanner;
public class Decendingorder {
    // Recursive method to print numbers from k to 0
    public static void printDescending(int k) {
        // Base case: if k is less than 0, stop the recursion
        if (k < 0) {
            return;
        }
        // Print the current number
        System.out.print(k + " ");
        // Recursive call with k - 1
        printDescending(k - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer value (k): ");
        int k = scanner.nextInt();

        // Call the recursive method to print the sequence
        printDescending(k);
        System.out.println(); // For a new line after the output

        scanner.close();
    }
}


