package reflectionExample;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Home {

	public static void main(String[] args) {

		Test t = new Test();
		Class clazz = t.getClass();
		
		System.out.println(clazz.getSimpleName());
		
		
		Constructor[] cons =  clazz.getDeclaredConstructors();
		System.out.println(cons.length);
        
		Method[] arraysOfMethods =  clazz.getDeclaredMethods();
		System.out.println(arraysOfMethods.length);
		
		for(Method m:arraysOfMethods) {
			System.out.println(m.getName() + " get Retun type is " + m.getReturnType());
			Parameter[] params = m.getParameters();
			
			for(Parameter param:params) {
				System.out.println(param.getName());
			}
		}
		
		/*
		 * 
		 * Login in log files - log4j
		 * log.debug(doLgin test executed);
		 * log.debug(doRegister test executed);
		 * 
		 * 
		 * 
		 * @BeforeMethod
		 * 
		 * 
		 * 
		 * @Test
		 * doLogin(String userName , String pass) {
		 * 
		 * 
		 *  }
		 * 
		 * 
		 * @Test 
		 * doUserReg() {
		 * 
		 * 
		 *  }
		 * 
		 * 
		 */
		
	}

}
