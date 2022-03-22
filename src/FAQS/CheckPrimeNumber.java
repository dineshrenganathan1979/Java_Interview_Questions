package FAQS;

public class CheckPrimeNumber {

	public static void main(String[] args) {

		//Examples -> 2, 3, 5, 7, 11, 13, 17..
		//Conditions a) Number should be greater than 1 b) Number should be divisible by 1 and itself
		int num=19;
		int count=0;
		
		if(num > 1) {
			for(int i=1; i<=num; i++) 
			{
				if(num%i == 0) 
					count++;
				
			}
			if(count==2) {
				System.out.println("The Given Number is a Prime Number");
			}
			else {
					System.out.println("The Given Number is not a Prime Number.");
			}
		}
		
		else {
			System.out.println("The Given Number is not a Prime Number.");
		}

	}

}
