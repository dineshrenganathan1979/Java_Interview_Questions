package FAQS;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingDataToTextFile {

	public static void main(String[] args) throws IOException {

		
		//Using FileWriter and BufferedWriter
		
		FileWriter fw = new FileWriter(System.getProperty("user.dir")+"\\src\\Test.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Welcome to My Java Programming");
		bw.write("\n");
		bw.write("And");
		bw.write("\n");
		bw.write("Welcome to Selenium Practice Session");
			
		
		System.out.println("Finished Writing !!!");
		bw.close();

	}

}
