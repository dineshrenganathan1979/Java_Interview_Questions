package FAQS;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the Number to Reverse");
		int num = scr.nextInt(); //1234
		
		int rev = 0;
		while(num !=0) { 
			rev = rev*10+num%10; //0+1234%10 = 4 40+3=43 430+2=432 4320+1 = 4321
			num = num/10; //1234/10=123 123/10=12  12/10=1
		}
       System.out.println("The Reversed Number is: "+rev);
	}

}
