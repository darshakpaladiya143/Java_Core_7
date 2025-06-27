package filewriting;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {

	public static void main(String[] args) throws IOException {
		
		// Stream Connectivity 
	
		File f = new File("C:\\FileWriting\\myTextFile.csv");
		
		// To append the file provide argument as true
		
		FileWriter fw = new FileWriter(f,true);
        BufferedWriter writer = new BufferedWriter(fw);
        
        
        for(int i=0;i<4;i++) {
        	for(int j=0;j<3;j++) {
        		
        		int num = (int) (Math.random()*100);
        		writer.write(num+",");
        	}
        	writer.newLine();
        }
        
        writer.flush();
        writer.close();

        
        // Writing inside file
//        writer.write("This is my first Line...");
//        writer.newLine();
//        writer.write("India");
//        writer.newLine();
//        writer.write("I m learning Selenium with the Java from the way2Automation.");
//        // Close the stream
//        writer.close();
//
       System.out.println("File has created...");
        
	}

}
