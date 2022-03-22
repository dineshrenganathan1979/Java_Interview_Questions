package FAQS;

import java.util.Arrays;
import java.util.List;

public class SearchingElementInArrayUsingCollections {

	public static void main(String[] args) {

		String[] arr = {"Rahul", "Utkarsh", "Shubham", "Neelam"};
		
		String searchElement = "Utkarsh";
		List al = Arrays.asList(arr);
		System.out.println(al);
		if(al.contains(searchElement)) {
			System.out.println("Found the Element: "+ searchElement +" In the Array");
		}

	}

}
