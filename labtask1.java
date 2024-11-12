import java.util.*;
public class labtask1 {
    public static void main(String[] args){
        //Scanner Sc=new Scanner(System.in);
        int [] arr1={10,20,30,40};
        int [] arr2={50,60,70,80};
        int [] arr3=arr1 ;
        arr1=arr2;
        arr2=arr3;
        System.out.println("Array 1: "+Arrays.toString(arr1)) ;
        System.out.println("Array 2: "+Arrays.toString(arr2)) ;
         
    }
}
