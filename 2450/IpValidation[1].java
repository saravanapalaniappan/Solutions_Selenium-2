/*

Program 4:

Employee id : 1243

This program will validate the ip address format using patter / Matcher concept.
Scanner object recieves the user input on running the program. No input may throw an error 

Error catching not implemented yet.

*/


import java.util.Scanner;  
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IpValidation{

public static boolean isIpValid(String ipAddress)  

{

Pattern ptn = Pattern.compile("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$");
Matcher mtch = ptn.matcher(ipAddress);
return mtch.find();

}

 public static void main(String[] args) {
     
     Scanner sc = new Scanner(System.in);
        System.out.println("Type IP address");
        String ipAddress=sc.next();  
        sc.close();
        
     System.out.println(ipAddress+ "    is  "+IpValidation.isIpValid(ipAddress));
     
 }

}