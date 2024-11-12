
import java.util.*;
public class task01 {
    public static void main(String[] args){
        ArrayList<String>menu=new ArrayList<String>();
        menu.add("biryani,");
        menu.add("pilauo,");
        menu.add("Qorma,");
        menu.add("haleem,");
        menu.add("chawal,");
        menu.add("spagethi,");
        menu.add("cold drink" );
        
        System.out.println("MENU:");
        for(String  a :  menu){
            System.out.print(a+" ");
        }
        System.out.println();
        String longest_string=" ";
        for(String a: menu){
            if(a.length()>longest_string.length()){
                longest_string=a;
            }
            
        }
        System.out.println(longest_string);
    }    
}
