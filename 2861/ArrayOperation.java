package com.htc.classexercise;
import java.util.Scanner;
public class ArrayOperation {

	public static void main(String[] args) {
		int [] array = new int [100];	//creating array of 1 to 100 numbers
        //int arrayvalue = 1;
		for (int i=0;i<100;i++) {
        	array[i] = i + 1;
        }
		System.out.println("Array is populated automatically with sequence numbers 1 thru 100 in each position");
        int cntoddatevenposition = 0;
        for (int i = 0; i < array.length; i++) 
        {
        	if (i % 2 == 0) {
        		if (array[i]%2!=0) {
        		 	if(array[i]%3==0) {
        				cntoddatevenposition++;
        			} 
        	//	System.out.print(array[i]);
        		}
        	}
                
        }
        System.out.println("Solution to array operation Count the number of odd numbers divisible by 3 in even positions :");
        System.out.println(cntoddatevenposition);
        System.out.println("Solution to array operation Search for a key value in array and print it is available in the array or not :");
        System.out.println("enter the value to be searched in the array");
        Scanner userinput = new Scanner(System.in);
        int valsrch = userinput.nextInt();
        userinput.close();
        boolean foundsw = false;
        for (int i = 0; i < array.length; i++) {
        	if(array[i] == valsrch ) {
        		System.out.println("Given value is found in array at position " + i);
        		foundsw = true;
        		break;
        	}
        }
        if (foundsw == false) {
        	System.out.println("Given value could not be found in array");
        }
     
        System.out.println("Solution to array operation Count the number of prime numbers :");
        int primecounter = 0;
        int maxcheck;
        boolean primefound;
        for (int i = 0; i < array.length; i++) {  
        	if (array[i]==1||array[i]==2) {
        		continue;
        	}
        	else {
        		maxcheck = array[i] / 2;
        		primefound = true;
        		for (int j = 2;j<=maxcheck;j++) {
        			if (array[i]%j==0) {
        				primefound = false;
        			}
        		}
        		if (primefound == true) {
    				primecounter++;
        		}
        	}
        }
        System.out.println("total prime numbers found in array are "+primecounter);
	}
}
