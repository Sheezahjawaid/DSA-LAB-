
public class task1 {
    public static void main(String[] args) {
       String st1="sheezah";
       String st2="jawaid";
       String st3= new String("sheezah");
       String st4= new String("jawaid");
       String st5=st3.intern(); // intern()  method
       System.out.println((st1==st5)+", st1 and st5 is equal to each other");
       System.out.println((st2==st4)+", st2 and st4 is not equal to each other");
       
       // showing that string are immutable
       
       String st6=("section F");
       String st7=st6.concat("!");// concatination creates new string
       String st8=st6.toUpperCase();
       System.out.println("original string:  " +  st6);
       System.out.println("new String:  " +st7);
       System.out.println("modified String: "+st8 );
    }
    
}

}
