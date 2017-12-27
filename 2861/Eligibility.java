package com.htc.classexercise;

import java.util.Scanner;

public class Eligibility { 
   public static void main(String[] args) {
	   Scanner userinput = new Scanner(System.in);
	   String maritalstatus;
	   String employmenttype;
	   int experienceyears;
	   System.out.println("Do you have a permanent Job? (Yes / No)");
	   employmenttype = userinput.next();
	   System.out.println("Are you Married? (Yes / No)");
	   maritalstatus = userinput.next();
	   System.out.println("How many years of experience do you have?");
	   experienceyears = userinput.nextInt();
	   System.out.println();
	   System.out.println("User input received as  ");
	   System.out.print("Married? ");
	   System.out.println(maritalstatus);
	   System.out.print("Permanent Employee? ");
	   System.out.println(employmenttype);
	   System.out.print("with experience of " );
	   System.out.print(experienceyears);
	   System.out.println(" years");
	   userinput.close();
	   int approvalamt;
	   approvalamt = checkeligibility(employmenttype, maritalstatus, experienceyears);
	   System.out.print("loan approved is: ");
	   System.out.println(approvalamt);

   }
   public static int checkeligibility(String permanent, String married, int exp){
	   int amt = 0;
	   if (permanent.equals("yes")){
		   if (married.equals("yes")){
			   if (exp >= 30){
					   amt = 600000;
			   }
			   else
				   amt =  350000;
		   }
		   else if (married.equals("no")){
			   if (exp >= 30){
				   amt = 500000;
			   }
			   else 
				   amt = 250000;
		   }		   
	   }
	   else if (permanent.equals("no")){
		   amt = 100000;
	   }
	return amt;
   }
}
