package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class testCase1 {

	
	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		
		// Instead of providing file path in this manner we can provide it using concatenation of the user.dir
		
		
		FileInputStream fis = new FileInputStream("D:\\eclipse-workspace\\Java_Lecture_7\\src\\config\\object.properties");
        prop.load(fis);		
        
        System.out.println(prop.getProperty("name"));
        System.out.println(prop.getProperty("course"));
        System.out.println(System.getProperty("user.dir"));
	}
	
}
