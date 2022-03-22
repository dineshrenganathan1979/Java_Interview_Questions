package FAQS;

import java.util.Scanner;

public class CheckPalindromeString {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a String: "); // madam
		String str = scr.next();
		String revString ="";
		
		int len = str.length(); //4
		
		for(int i= len-1; i>=0; i--) { // 3 2 1 0 -1
			revString = revString+str.charAt(i);   //DCBA
		}
       if(str.equalsIgnoreCase(revString)) {
    	   System.out.println("The Given String "+ str +" is a Palindrome");
       }
       else {
    	   System.out.println("The Given String "+ str +" is a not a Palindrome");
       }

	}

}
