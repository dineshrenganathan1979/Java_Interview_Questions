package FAQS;

public class ReverseEachWordInAString {

	public static void main(String[] args) {

		String str="Welcome To Java";
		String[] words = str.split("\\s");
		String reversedWord="";
		
		
		for(String w: words) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			reversedWord = reversedWord+sb.toString()+" ";
		}
		
		System.out.println("The Reversed String is: "+reversedWord);
		
	}

}
