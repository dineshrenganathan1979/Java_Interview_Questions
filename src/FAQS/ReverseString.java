package FAQS;

public class ReverseString {

	public static void main(String[] args) {


		String str = "ABCD";
		String rev ="";
		
		int len = str.length(); //4
		
		for(int i= len-1; i>=0; i--) { // 3 2 1 0 -1
			rev = rev+str.charAt(i);   //DCBA
		}
       System.out.println("The Reversed String is: "+rev); 
	}

}
