package collectionsExample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {

		
		ArrayList list = new ArrayList();
		
		
		// Size 
		System.out.println(list.size());
		
		list.add(10);
		list.add("Darshak");
		list.add(10.25);
		list.add('L');
        list.add(true);		
        list.add(null);
        list.add(10.25);
        
		System.out.println(list);
		System.out.println(list.size());
		
		// How to fetch the value from the list
		list.get(0);
		System.out.println(list.get(1));
		
		// remove
		
		list.remove(5);
		System.out.println(list);
		System.out.println(list.size());
		
//		for(int i = 0;i<list.size();i++) {
//			System.out.println(list.get(i));				
//		}
		
		
//		for(Object var:list) {
//			System.out.println(var);
//		}
		
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
