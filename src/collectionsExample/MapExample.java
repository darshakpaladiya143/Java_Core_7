package collectionsExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;

public class MapExample {

	public static void main(String[] args) {

		Map <String,String> map = new HashMap<String,String>();

		map.put("firstName", "Darshak");
		map.put("lastName", "Paladiya");
		map.put("sub", "Selenium");
		map.put("location", "India");
		
		System.out.println(map);
		System.out.println(map.size());
		
		
		
		System.out.println(map.get("firstName"));
//		map.get("firstName");
		
		Set<String> keys = map.keySet();
		
		for(String key:keys) {
			System.out.println("Key is =======> " + "Value=======>" + map.get(key));
		}
		
		Map<String, List> map1 = new HashMap<String, List>();
		
		ArrayList<String> listofEmails = new ArrayList<String>();
		listofEmails.add("darshak143@yopmail.com");
		listofEmails.add("dpy@narola.email");
		listofEmails.add("flyingqa@outlook.com");
		
//		map.put("email", listofEmails);
				
	}

}
