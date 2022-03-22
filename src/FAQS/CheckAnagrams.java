package FAQS;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagrams {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter String 1: ");
		String str1 = scr.nextLine().toUpperCase();
		
		System.out.println("Enter String 2: ");
		String str2 = scr.nextLine().toUpperCase();
			
		if(isAnagram(str1, str2)){
			System.out.println("Strings :"+str1 +" and "+ str2 +" are Anagrams");
		}
		else {
			System.out.println("Strings :"+str1 +" and "+ str2 +" are not Anagrams");
		}
	}

	public static boolean isAnagram(String s1, String s2) {
		
		if(s1.length() != s2.length()) {
			return false;
		}
		
		else {
			char[] str1Array = s1.toCharArray();
			char[] str2Array = s2.toCharArray();
			
			Arrays.sort(str1Array);
			Arrays.sort(str2Array);
			
			return Arrays.equals(str1Array, str2Array);
		}
			
	}
}
