package FAQS;

import java.util.HashSet;

public class FindDuplicateElementsInArray {

	public static void main(String[] args) {

		String arr[] = {"Java", "C", "C++", "Python", "Java" ,"C"};
		
		HashSet lang = new HashSet();
		boolean flag = false;
		
		for(String l: arr) {
			if(lang.add(l)==false) {
				System.out.println("The Duplicate Element is: "+ l);
				flag = true;
			}
		}
        if(flag==false) {
        	System.out.println("No Duplicate Elements found in the Array");
        }
	}

}
