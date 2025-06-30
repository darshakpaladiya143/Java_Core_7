
public class ComparisonTest {

	public static void main(String[] args) {

		
		String name1 = "Way2Automation";
		String name2 = "Way2Automation";
		
		String name_1 = new String("Darshak");
		String name_2 = new String("Darshak");
		
		
		int x = 100;
		int y = 100;
		
//		System.out.println(name1==name2);
//		System.out.println(name1.equals(name2));
//		System.out.println(x==y);
		
//		System.out.println(name_1==name_2);
//	    System.out.println(name_1.equals(name_2));
		
		SingleTonTest s1 = SingleTonTest.getInstance();
		System.out.println(s1);
		SingleTonTest s2 = SingleTonTest.getInstance();
		System.out.println(s2);
		
		System.out.println(s1==s2);    // address of that object
	}

}
