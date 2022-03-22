package FAQS;

import java.util.Scanner;

public class CheckArmStrongNumber {

	public static void main(String[] args) {

    //Logic:
	// 153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter any Number to Check: ");
		int num = scr.nextInt();
		int temp = num;
		int reminder,sum=0;
		
		while(num > 0) {
			reminder= num%10;
			num = num/10;
			sum = sum+ reminder * reminder * reminder;
		}
		if(temp == sum) {
			System.out.println("The Given Number "+ temp + " Is an Armstrong Number");
		}else {
			System.out.println("The Given Number "+ temp + " Is not an Armstrong Number");
		}
	}

}
