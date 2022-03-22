package FAQS;

public class CountOccurancesOfCharactersInString {

	public static void main(String[] args) {

     String str = "Java Programming Java oops";
     int total_length = str.length();
     String character = "a";
     
     int total_length_after_removal = str.replace(character, "").length();
     
     int countOfOccurance = total_length - total_length_after_removal;
     System.out.println("The Number of Occurance of "+character + " is: "+countOfOccurance);
		

	}

}
