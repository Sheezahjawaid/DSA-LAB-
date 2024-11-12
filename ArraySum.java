import java.util.Scanner;
public class ArraySum {
    // Recursive method to calculate the sum of elements in an array
    public static int sumArray(int[] arr, int n) {
        // Base case: if n is 0, return 0 (no elements left to add)
        if (n <= 0) {
            return 0;
        }
        // Recursive case: add the last element and the sum of the remaining elements
        return arr[n - 1] + sumArray(arr, n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for the number of elements
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        
        // Initialize the array
        int[] arr = new int[size];
        
        // Read elements into the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        // Calculate the sum of the array elements
        int result = sumArray(arr, size);
        System.out.println("The sum of the elements in the array is: " + result);
    }   
}
