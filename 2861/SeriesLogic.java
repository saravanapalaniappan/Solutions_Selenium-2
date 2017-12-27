package com.htc.classexercise;

public class SeriesLogic {
	 public static void main(String args[]) {
		 int cntr = 1; // temp variable to flip sign
		 for (int i=1;i<100;i++) {
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
 		 for (int i=1;i<100;i++) {
			 System.out.print("1/"+i+",");
		 } 
	 }
}
