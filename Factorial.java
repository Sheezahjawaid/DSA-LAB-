 import java.util.Scanner;
public class Factorial {
   
    // Recursive method to calculate the factorial of n
    public static long factorial(int n) {
        // Base case: if n is 0, return 1 (0! = 1)
        if (n == 0) {
            return 1;
        }
        // Recursive case: n! = n * (n-1)!
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = scanner.nextInt();

        // Check if the input is non-negative
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Calculate the factorial and print the result
            long result = factorial(n);
            System.out.println("The factorial of " + n + " is: " + result);
        }

        scanner.close();
    }
}


