package FAQS;

import java.util.Arrays;

public class SortingElementsInArray {

	public static void main(String[] args) {

		int[] arr = {20, 40, 30, 10, 5};
		System.out.println("Integer Array Elements Before Sorting: "+Arrays.toString(arr));
		
		Arrays.sort(arr);
		
		System.out.println("Integer Array Elements After Sorting: "+Arrays.toString(arr));
		
		
		String[] str = {"Java","C", "Python", "Oracle", "Javascript"};
		
		System.out.println("String Array Elements Before Sorting: "+Arrays.toString(str));
		
		Arrays.sort(str);
		
		System.out.println("String Array Elements After Sorting: "+Arrays.toString(str));
		
	}

}
