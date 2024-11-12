import java.util.Scanner;
public class SumFrom1ToN {
    public static int sum(int n) {
        // Base case: if n is 1, return 1
        if (n == 1) {
            return 1;
        }
        // Recursive case: add n to the sum of the numbers from 1 to n-1
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer N: ");
        int n = scanner.nextInt();

        // Check if the input is positive
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Calculate the sum and print the result
            int result = sum(n);
            System.out.println("The sum of numbers from 1 to " + n + " is: " + result);
        }
    }
}


