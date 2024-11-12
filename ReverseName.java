  import java.util.Scanner;
public class ReverseName {


    // Recursive method to reverse the name
    public static String reverseString(String name) {
        // Base case: if the string is empty, return an empty string
        if (name.isEmpty()) {
            return name;
        }
        // Recursive case: get the last character and append it to the reversed substring
        return name.charAt(name.length() - 1) + reverseString(name.substring(0, name.length() - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String name = scanner.nextLine();

        // Reverse the name using the recursive method
        String reversedName = reverseString(name);
        System.out.println("Reversed Name: " + reversedName);

        scanner.close();
    }
}
  

