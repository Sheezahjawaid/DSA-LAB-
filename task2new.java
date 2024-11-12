/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*;
public class task2new {
    public static void main (String[] args){
    Scanner Sc=new Scanner(System.in);
    ArrayList<String>menu=new ArrayList<String>();
    System.out.println("enter the length of your arraylist :");
    int x=Sc.nextInt();
    for(int i=0;i<=x-1;i++){
        String a=Sc.next();
        menu.add(a );
    }
    System.out.print("MENU: "+ menu);
    System.out.println();
    String longest_string=" ";
    for(String b: menu){
        if(b.length()>longest_string.length()){
            longest_string= b;
        }    
    }
    System.out.println("longest Item In The list is :"+longest_string );
    }
}
