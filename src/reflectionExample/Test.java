package reflectionExample;

public class Test {
	
	
	public Test() {
		
	}
	
	
	public Test(int a) {
		
	}
	

	public static void main(String[] args) {
	
		Test t = new Test();
		System.out.println(t.getClass().getSimpleName());
		
	}
	
	public void show() {
		
	}
	
	public int add(int a , int b) {
		return 10;
		
	}
	
	public double print() {
		return 10.25;
		
	}

}
