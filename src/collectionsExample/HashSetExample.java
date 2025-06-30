package collectionsExample;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {

		
		HashSet<String> set = new HashSet<String>();
		
		set.add("Darshak");
		set.add("Way2Automation");
		set.add("Selenium");
		set.add("Appium");
		set.add("Paladiya");
		
		System.out.println(set);
		
//		for(int i=0;i<set.size();i++) {
//			System.out.println(i);
//		}
		
//		for(String var:set) {
//			System.out.println(var);
//		}
		
//		Iterator itr = set.iterator();
//		
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//			
//		}
		
		
		Iterator<String> itr = set.iterator();
		

		
		while(itr.hasNext()) {
			String var = itr.next();
             if(var.equals("Appium")) {
            	 System.out.println(var);
             }
		}
		
		

	}

}
