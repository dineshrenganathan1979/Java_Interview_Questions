package FAQS;

public class RemoveJunkSpecialCharactersInString {

	public static void main(String[] args) {

		String s = "#@$#@String&^%&%&<<>>!!@@~~)((**latin value 012345677890";
		
		s= s.replaceAll("[^A-Za-z0-9]", "");
		System.out.println("After Removing Special and Junk Characters the String is: "+s);

	}

}
