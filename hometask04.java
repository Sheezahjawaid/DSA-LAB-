
public class hometask04 {
    public static int MissingNumber(int[] array) {
        int n = array.length;  
        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;
        for (int num : array) {
            arraySum += num;
        }
        return totalSum - arraySum;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,9,8};  
        System.out.println("The missing number is: " + MissingNumber(arr));
    }
}


