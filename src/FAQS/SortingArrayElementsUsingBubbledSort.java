package FAQS;

import java.util.Arrays;

public class SortingArrayElementsUsingBubbledSort {

	public static void main(String[] args) {


		int a[] = {4, 2, 1, 5, 3};
		
		System.out.println("Array before sorting: "+Arrays.toString(a));
		
		int n = a.length;
		
		for(int i=0; i<n-1; i++) { //Number of Passes
			
			for(int j=0; j<n-1; j++) {  // Iterations in each Pass
				
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		System.out.println("Array after sorting: "+Arrays.toString(a));
	}

}
