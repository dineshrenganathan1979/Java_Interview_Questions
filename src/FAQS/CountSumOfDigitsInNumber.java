package FAQS;

public class CountSumOfDigitsInNumber {

	public static void main(String[] args) {

		  int num = 123456;
	      int sum = 0;
	      
	      while(num > 0) {
	    	  sum = sum+ num%10;
	    	  num = num/10; //12345 1234 123 12 1 
	    	      	  
	      }
	       System.out.println("The Sum of Digits in the Given Number is : "+sum);
		}

	}
