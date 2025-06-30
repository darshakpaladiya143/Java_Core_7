package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class testFilereading_writing {
	
	public static void main(String[] args) throws IOException {
		        
		        // Step 1: Ensure the directory exists
		        File directory = new File("C:\\screenshot");
		        if (!directory.exists()) {
		            directory.mkdirs();  // create directory if it doesn't exist
		        }

		        // Step 2: Create the file
		        File file = new File(directory, "test.txt");
		        if (!file.exists()) {
		            file.createNewFile();  // create file only if it doesn't already exist
		        }

		        // Step 3: Write to the file
		        FileWriter fw = new FileWriter(file);
		        BufferedWriter filewriter = new BufferedWriter(fw);
		        
		        filewriter.write("Please write inside this file.");
		        filewriter.newLine();
                filewriter.write("This is my second line.");
		        filewriter.flush();
		        filewriter.close();  // Always good practice to close the writer
		        System.out.println("File created and content written successfully.");
		        
		        // read from file 
		        
		        FileReader fr = new FileReader("C:\\screenshot\\test.txt");
		        BufferedReader filereader = new BufferedReader(fr);
		        
		        String i = "";
		        
//		        System.out.println(filereader.readLine());
		        
		        while((i=filereader.readLine())!= null) {
		        	System.out.println(i);
		        }
		     
	
		    }
		
	}

