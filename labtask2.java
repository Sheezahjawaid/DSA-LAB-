import java.util.*;
import java.util.stream.*;
public class labtask2 {
    public static void main(String[] args){
      int arr1[]={10,20,30,40,60};
      int arr2[]={50,60,70,80};
      Integer[] mergedArray = Stream.concat(Arrays.stream(arr1).boxed(), Arrays.stream(arr2).boxed()).toArray(Integer[]::new);
      System.out.println(Arrays.toString(mergedArray));
      
    }
}
