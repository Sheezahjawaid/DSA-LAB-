import java.util.Scanner;
public class PalindromeCheck {
    // Recursive method to check if the string is a palindrome
    public static boolean isPalindrome(String str, int start, int end) {
        // Base case: if start index is greater than or equal to end index
        if (start >= end) {
            return true;
        }
        // Recursive case: check if characters at start and end are the same
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        // Move towards the center of the string
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        // Remove spaces and convert to lowercase for case-insensitive checking
        str = str.replaceAll("\\s", "").toLowerCase();

        // Check if the string is a palindrome
        if (isPalindrome(str, 0, str.length() - 1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}

