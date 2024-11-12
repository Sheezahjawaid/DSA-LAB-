import java.util.Scanner;
public class GCDUsingRecursion {
    // Recursive method to calculate the GCD of two numbers
    public static int gcd(int a, int b) {
        // Base case: if b is 0, return a
        if (b == 0) {
            return a;
        }
        // Recursive case: call gcd with (b, a % b)
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        // Calculate the GCD and print the result
        int result = gcd(a, b);
        System.out.println("The GCD of " + a + " and " + b + " is: " + result);

        scanner.close();
    }
}
