import java.util.*;
public class hometak01 {
    public static void main(String[] args){
        Scanner Sc=new Scanner(System.in);
        int[] Array=new int[7];
        int sum=0;
        double mean;
        ArrayList<Integer> array2 = new ArrayList<>();
        System.out.println("enter numbers:");
        for(int i=0;i<Array.length;i++){
            Array[i]=Sc.nextInt();
            array2.add(Array[i]);
            sum+=Array[i];
        }
        mean=(double)sum/Array.length;
        System.out.println(array2);
        System.out.println(sum+ " is the sum of array");
        System.out.println(mean+ " is the mean of the element in the array ");
    }
}
