/* 

Program 1 in assignment
Employee id : 1243

This will prompt 3 questions and based on the input it decides the loan amount sanctioned 

*/

import java.util.Scanner;  

class EmployeeLoan{  
    
 public static void main(String args[]){  
     
   Scanner sc = new Scanner(System.in);
   System.out.println("Are you Married (Input should be Yes or No)");
   String maritalstat=sc.next();  
   System.out.println("Are you Permenant Job holder (Input should be Yes or No)");
   String jobstatus=sc.next();  
      //System.out.println(name);
  System.out.println("Your Years of Service");    
  int yearsofservice = sc.nextInt();
  
  sc.close();
  
  if (jobstatus.equals("yes"))
  
  {
      if (maritalstat.equals("yes"))
      
             if (yearsofservice <=30)
                    {
                    System.out.println("Your loan amount sanctioned is Rs.600,000"); 
                    }
                    else
                {
                    System.out.println("Your loan amount sanctioned is Rs.350,000"); 
                }
      else
      {
          if (yearsofservice <=30)
                {
                    System.out.println("Your loan amount sanctioned is Rs.500,000");
                }
                else
                {
                     System.out.println("Your loan amount sanctioned is Rs.250,000");
                }
      }
      
  }
  
  else 
  
  {
      System.out.println("Your loan amount sanctioned is Rs.100,000");
      
  }
  
 }  
}   
