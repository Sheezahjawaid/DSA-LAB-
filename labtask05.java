import java.util.*;
import java.util.stream.*;
public class labtask05 {
    public static void main(String[] args){
      int arr1[]={10,20,30,40,60};
      int arr2[]={50,60,70,80};
      Integer[] mergedArray = Stream.concat(Arrays.stream(arr1).boxed(), Arrays.stream(arr2).boxed())
                                      .collect(Collectors.toCollection(LinkedHashSet::new))
                                      .toArray(new Integer[0]);
      System.out.println("Remove Duplicate 60 from Array : ");

        System.out.println(Arrays.toString(mergedArray));
    }
}
