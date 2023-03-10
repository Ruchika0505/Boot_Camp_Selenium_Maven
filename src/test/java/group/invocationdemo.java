package group;

import org.testng.annotations.Test;

public class invocationdemo {

	
	
	public class InvocationCountDemo {

		@Test(invocationCount=10)
		void test()
		{
		System.out.println("testing...");	
		}
		
	}

}
