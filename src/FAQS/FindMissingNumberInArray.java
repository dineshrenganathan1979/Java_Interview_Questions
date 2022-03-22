package FAQS;

public class FindMissingNumberInArray {

	public static void main(String[] args) {
		
		//Conditions:
		//Array Should not have duplicates
		//Array not necessary to be in sorted order
		//Values should be in range

		int a[] = {1,2,4,5,6};
		//1+2+4+5+6 = 12 = sum1
		//1+2+3+4+5+6 = 15 = sum2
		//sum2-sum1 = 15-12 = 3 = missingNumber
		
		int sum1=0;
				
		for(int i=0; i<a.length; i++) {
			sum1 = sum1+a[i];
		}
		System.out.println("Sum of elements in array: "+sum1);
		
		int sum2=0;
		
		for(int i=0; i<7; i++) {
			sum2 = sum2+i;
		}
		System.out.println("Sum of Range of elements in array: "+sum2);
		System.out.println("The Missing number in the array is: "+ (sum2-sum1));

	}

}
