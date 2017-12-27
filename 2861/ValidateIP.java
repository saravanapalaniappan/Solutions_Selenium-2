package com.htc.classexercise;

import java.util.Scanner;

public class ValidateIP {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.println("please enter IP address string to validate");
		String inputip = new String(userinput.nextLine());
		userinput.close();
		if (validateIP(inputip)==true) {
			System.out.println("Its a valid IP");	
		}
		else {
			System.out.println("Its an invalid IP");	
		}
	}

	public static boolean validateIP(String ip) {
		if(ip.length() < 7) return false;
		if(ip.length() > 15) return false;
		if(ip.charAt(0) == '.') return false;
		if(ip.charAt(ip.length()-1) == '.') return false;
		int countdot = 0;
		for (int i=0;i<ip.length();i++) {
			if (ip.charAt(i)=='.') {
				countdot++;
			}
	    }
		if (countdot != 3) return false;
		return true;
	}
}
