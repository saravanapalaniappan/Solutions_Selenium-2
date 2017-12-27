package com.htc.classexercise;

public class SeriesLogic {
	 public static void main(String args[]) {
		 int i = 99;  //numbers to be printed in series
		 int cntr = 1; // temp variable to flip sign
		 for (i=1;i<100;i++) {
			 if(i % 2 == 0) {
				 i++;
			 }
			 if (cntr % 2 == 0) {	
				 System.out.print(-i+",");
			 }
			 else {
				 System.out.print(i+",");
			 }
			 cntr++;
		 }
		 System.out.println("");
		 i=1;
 		 for (i=1;i<100;i++) {
			 System.out.print("1/"+i+",");
		 } 
	 }
}