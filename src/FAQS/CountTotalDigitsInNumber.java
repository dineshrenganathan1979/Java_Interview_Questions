package FAQS;

public class CountTotalDigitsInNumber {

	public static void main(String[] args) {

      int num = 123456;
      int count = 0;
      
      while(num > 0) {
    	  num = num/10; //12345 1234 123 12 1 
    	  count = count+1;
    	  
      }
       System.out.println("The Number of Digits in the Given Number is : "+count);
	}

}
