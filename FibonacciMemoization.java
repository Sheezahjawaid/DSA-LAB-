import java.util.Scanner;
public class FibonacciMemoization {

    // Array to store Fibonacci numbers for memoization
    private static long[] memo;

    // Recursive method to calculate the N-th Fibonacci number using memoization
    public static long fibonacci(int n) {
        // Base cases
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        // Check if the value has already been computed
        if (memo[n] != -1) {
            return memo[n];
        }
        // Calculate the Fibonacci number and store it in the memo array
        memo[n] = fibonacci(n - 1) + fibonacci(n - 2);
        return memo[n];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer N to find the N-th Fibonacci number: ");
        int n = scanner.nextInt();

        // Check if the input is a non-negative integer
        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            // Initialize the memoization array with -1
            memo = new long[n + 1];
            for (int i = 0; i <= n; i++) {
                memo[i] = -1; // Initialize all values to -1 (not computed)
            }
            // Calculate the N-th Fibonacci number
            long result = fibonacci(n);
            System.out.println("The " + n + "-th term in the Fibonacci series is: " + result);
        }

        scanner.close();
    }
}
