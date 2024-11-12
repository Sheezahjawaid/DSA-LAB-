import java.util.Scanner;
public class CountDigits {
    // Recursive method to count the digits of a number
    public static int countDigits(int n) {
        // Base case: if n is 0, return 0
        if (n == 0) {
            return 0;
        }
        // Recursive case: divide n by 10 and add 1 to the count
        return 1 + countDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = scanner.nextInt();

        // Check if the input is non-negative
        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            // Handle the special case when n is 0
            if (n == 0) {
                System.out.println("The number of digits in " + n + " is: 1");
            } else {
                // Calculate the number of digits and print the result
                int digitCount = countDigits(n);
                System.out.println("The number of digits in " + n + " is: " + digitCount);
            }
        }
    }
}


