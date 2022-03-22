package FAQS;

import java.util.Scanner;

public class Swap2Numbers {

	public static void main(String[] args) {
    
		int a =10;
		int b=20;
		
		System.out.println("Number's Before Swpping is a value is : "+a +" & b value is: "+ b);
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("Number's After Swpping is a value is : "+a +" & b value is: "+ b);

	}

}
