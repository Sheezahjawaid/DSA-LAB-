import java.util.*;
public class hometask02 {
    public void  array(){
        int []arr={10,20,30,40,50,60,70,90};
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number to compare with key:");
        int num=Sc.nextInt();
        int key=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
            key=i;
            break;
            }
        }
            if(key!=-1){
            System.out.println("----------'spliting the array according to the key'------------ ");
            int[] firstPart = Arrays.copyOfRange(arr, 0, key); 
            int[] secondPart = Arrays.copyOfRange(arr, key, arr.length);
            System.out.println("First part of the array: " + Arrays.toString(firstPart));
            System.out.println("Second part of the array: " + Arrays.toString(secondPart));
        } else {
            System.out.println("----------'spliting of array not possible'------------ ");
            System.out.println("The number you entered doesn't match the key.");
        }   
    }
    public static void main(String[] args) {
        hometask02 task = new hometask02();
        task.array();
    }
}
