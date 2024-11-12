public class labtask3 {
public static void main(String[] args) {
        String arr1[] = {"dad", "cup", "boss", "madam"};
        for (String a : arr1) {
            if (isPalindrome(a)) {
                System.out.println(a + " is a palindrome.");
            } else {
                System.out.println(a + " is not a palindrome.");
            }
        }
    }
    public static boolean isPalindrome(String a) {
        return a.equals(new StringBuilder(a).reverse().toString());
    }
}
