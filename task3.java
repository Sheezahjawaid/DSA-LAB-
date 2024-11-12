/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*;

public class task3 {
    public static  void main(String[] args){
      Scanner Sc=new Scanner(System.in);
      ArrayList<String>employee_detail=new ArrayList<String>();
      System.out.println("how many employess detail");
      int y=Sc.nextInt();
        for(int j=0;j<=y;j++){
          System.out.println("---------FOR EMPLOYEE----------");
         int x=1;
         for (int i=1;i<=x;i++){
           String name=Sc.next();
           employee_detail.add(name);
           System.out.println("name of emplooyee " +name);
         }
         for(int i=1;i<=x;i++){
            String emp_Id=Sc.next();
            employee_detail.add(emp_Id);
            System.out.println("employee_ID: " +emp_Id);
         }
         
         for(int i=1;i<=x;i++){
            String gender=Sc.next();
            employee_detail.add(gender);
            System.out.println("employee gender is  " +gender);
         }
           
         for(int i=1;i<=x;i++){
             String joining_year=Sc.next(); 
             employee_detail.add(joining_year);
             System.out.println("employee joining year " +joining_year);
            
         }
         System.out.println(employee_detail);  
         System.out.println();
        }
        
        Collections.sort(Comparator.comparingInt(employee::getjoining_year));
        for(String employee : employee_detail) {
            System.out.println(employee);
        } 
        
    }
  
}
