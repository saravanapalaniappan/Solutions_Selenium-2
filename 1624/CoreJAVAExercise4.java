package com.htc.corejava;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher; 

public class CoreJAVAExercise4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter ip Address: ");
		String str = scanner.nextLine();
		scanner.close();

		CoreJAVAExercise4 ipAddressVal = new CoreJAVAExercise4();
		
		if(ipAddressVal.ipAddressValidate(str)) {
			System.out.println("You entered valid ipAddress " + str);
		}
		else
			System.out.println("You entered invalid ipAddress " + str);
		
	}
	
	private boolean ipAddressValidate(String str) {
		String inputString = str;
		int strLength=0;
		boolean flg = false;
		
		strLength = inputString.length();
		
		//Length should be minimum 7 and maximum 15
		if(strLength >= 7 && strLength <= 15) {
			flg=true;
		}
		
		//Should not start and end with dot
		if(flg == true) {
			if(inputString.charAt(0) != '.' && inputString.charAt(strLength - 1) != '.' ) {
				flg = true;
			}
			else {
				System.out.println("The iPAddress cannot start or end with dot");
				flg = false;
			}
				
		}
		else
			System.out.println("Length of the iPAddress should be minimum 7 and maximum 15");
			
		
		//Should have exactly 3 dots
		if(flg) {
			int counter = 0;
			for(int i = 0; i < strLength; i++) {
				if(inputString.charAt(i) == '.') {
					counter++;
				}
			}
			
			if(counter != 3) {
				System.out.println("The ipAddress should have exactly 3 dots.");
				flg = false;
			}
		}
		
		//Dots should not be in consecutive positions.
		int j=0;
		int i=0;
		if(flg) {
			while (j > 0) {
				if(inputString.charAt(i) == '.') {
					j=j-1;
				}
				else {
					j=j+1;
				}
				i=i+1;
			}
			
		    if(j < 0) {
		    	System.out.println("The ipAddress cannot have consecutive positioned dots.");
		    	flg = false;
		    }
		    else {
		    	flg = true;
		    }
		}

		if(flg) {
			//Should not permit alphabets and special characters
			boolean matchPatter=true;
			Pattern pattern=Pattern.compile("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$");
			Matcher m=pattern.matcher(inputString);
			matchPatter = m.find();
			
			System.out.println(matchPatter);
		}
		
		return flg;
		

	}

}
