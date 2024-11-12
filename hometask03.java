public class hometask03 {
    public static void main (String[] args){
        int[] Array={1,2,3,4,5,6,7,8};
        int target=8;
        for(int i=0;i<Array.length;i++){
            for(int j=i+1;j<Array.length;j++){
                if(Array[i]+Array[j]==target){
                    System.out.println("Pair found: " + Array[i] + " and " + Array[j]);
                }
            }
        }
        
    }
}
