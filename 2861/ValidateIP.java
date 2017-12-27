package com.htc.classexercise;

import java.util.Scanner;

public class ValidateIP {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.println("please enter IP address string to validate");
		String inputip = new String(userinput.nextLine());
		userinput.close();
		if (validateIPaddress(inputip)==true) {
			System.out.println("Its a valid IP");	
		}
		else {
			System.out.println("Its an invalid IP");	
		}
	}

	public static boolean validateIPaddress(String ip) {
		if (ip.length() < 7) return false;
		if (ip.length() > 15) return false;
		if (ip.startsWith(".")) return false;
		if (ip.endsWith(".")) return false;
		int countdot = 0;
		for (int i=0;i<ip.length();i++) { //check consecutive dots
			if (ip.charAt(i)=='.') {
				countdot++;
			}
	    }
 		String twodots = new String("..");
		if (ip.contains(twodots)) return false;
		if (countdot != 3) return false;
	    for (int i = 0; i < ip.length(); i++) {  //check alphabets and special char
	        if ((ip.charAt(i) < '0' || ip.charAt(i) > '9') && ip.charAt(i) != '.') {
	          return false;
	        }
	    }
		return true;
	}
}