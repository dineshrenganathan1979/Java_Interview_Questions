package FAQS;

import java.util.Scanner;

public class CountWordsInString {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the String: "); // Welcome to Java Programming
		
		String str = scr.nextLine();


		String[] words =str.split(" ");
		System.out.println("Total Words Count is: "+ words.length);
		
		
		
		
	}

}
