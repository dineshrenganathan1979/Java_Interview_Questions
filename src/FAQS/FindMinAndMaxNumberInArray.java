package FAQS;

public class FindMinAndMaxNumberInArray {

	public static void main(String[] args) {

		System.out.println("---Finding Maximum Number in the Array---");
		int a[] = {50, 10, 20, 40, 60};
		int max = a[0];
		
		for(int i=1; i<a.length; i++) {
			
			if(a[i]>max) {
				max = a[i];
			}
		}
		System.out.println("The Maximum Number in the Array is: "+max);
		
		System.out.println("---Finding Minimum Number in the Array---");
	
		int min = a[0];
		
		for(int i=1; i<a.length; i++) {
			
			if(a[i]< min) {
				min = a[i];
			}
		}
		System.out.println("The Maximum Number in the Array is: "+min);

	}

}
