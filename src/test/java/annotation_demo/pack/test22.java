package annotation_demo.pack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test22 {

	
	@Test
	public void xyz()
	{
		System.out.println("This is xyz from test2");
	}
	@AfterTest
	void n()
	{
		System.out.println("this After class");
	}
}
