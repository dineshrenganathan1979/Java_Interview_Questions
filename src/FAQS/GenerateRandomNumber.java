package FAQS;

import java.util.Random;

public class GenerateRandomNumber {

	public static void main(String[] args) {

		//Approach 1 -> Using Random class
		Random rand = new Random();
		int rand_num = rand.nextInt();
		//double rand_double = rand.nextDouble();
		System.out.println(rand_num);
		
		//Approach 2 -> Using Math Class
		System.out.println(20*Math.random());

	}

}
