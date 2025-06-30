package collectionsExample;

public class AutoBoxing {

	public static void main(String[] args) {
		
		int var = 10;
		
		Integer obj = new Integer(var);    // wrapping   [Auto-boxing]
		
		System.out.println(obj);
		
		
        int i = obj;    // unwrapping  [UnBoxing]
        
        

	}

}
