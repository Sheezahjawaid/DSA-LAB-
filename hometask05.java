import java.util.*;
public class hometask05 {
   public static void zigzagSort(int[] arr) {
        Arrays.sort(arr); // Sort the array first
        for (int i = 1; i < arr.length; i += 2) {
            if (i + 1 < arr.length) {
                // Swap the elements
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {820,96,32,42,56};
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Array in Zigzag Pattern:");
        zigzagSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
    
        
        
       