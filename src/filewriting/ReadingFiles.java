package filewriting;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFiles {
	
	public static void main(String[] args) throws IOException {
		
		// Connecting Steams
		
		File f = new File("C:\\\\FileWriting\\\\myTextFile.txt");
		FileReader fr = new FileReader(f);
		BufferedReader reader = new BufferedReader(fr);
		
		// Read the text file 
		
		String line = null;
		
		while((line = reader.readLine())!= null) {
	           System.out.println(line);
		}
		
//		System.out.println(reader.readLine());
//		System.out.println(reader.readLine());
//		reader.close();
		
		
	}

}
