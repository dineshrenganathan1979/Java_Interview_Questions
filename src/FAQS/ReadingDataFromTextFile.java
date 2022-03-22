package FAQS;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadingDataFromTextFile {

	public static void main(String[] args) throws IOException {
		
		System.out.println("---Approach 1---"); 
		//Approch 1: Using FileReader and BuferedReader
		
		FileReader fr = new FileReader(System.getProperty("user.dir")+"\\src\\Test.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		String str="";
		
		while((str =br.readLine())!= null) {
			System.out.println(str);
		}
		
		br.close();
			
		System.out.println("---Approach 2---"); 
		//Approach 2: Using Scanner & File
		
		File file = new File(System.getProperty("user.dir")+"\\src\\Test.txt");
		Scanner scr = new Scanner(file);
		
		while(scr.hasNextLine()) {
			System.out.println(scr.nextLine());
		}

		

	}

}
