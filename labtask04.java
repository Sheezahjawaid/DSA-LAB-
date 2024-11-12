public class labtask04 {
    public static void main(String[] args){
        int[] Array = new int[]{10, 45, 25, 60, 89, 72, 42, 14, 19, 7};
        int evencount=0;
        int oddcount=0;
        for(int i=0;i<Array.length;i++){
           if(Array[i] % 2 == 0) {
               evencount++;
               System.out.println(Array[i] +" is even number");
           }else{
               oddcount++;
               System.out.println(Array[i]+ " is odd number ");  
        }
        }
        System.out.println("EVEN COUNT IS: "+evencount);
        System.out.println("ODD COUNT IS : " + oddcount);
    }
}
