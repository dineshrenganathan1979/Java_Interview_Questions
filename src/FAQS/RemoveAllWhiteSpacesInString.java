package FAQS;

public class RemoveAllWhiteSpacesInString {

	public static void main(String[] args) {
		 
		String str = " Java Programming   and  Selenium   automation ";
		str = str.replaceAll("\\s", "");
		System.out.println("After Removing the White Spaces: "+str);

	}

}
