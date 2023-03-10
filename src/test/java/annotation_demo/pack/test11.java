package annotation_demo.pack;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class test11 {

	@Test
	public void abc()
	{
		System.out.println("This is abc from test1");
	}
	@BeforeTest
	void m()
	{
		System.out.println("this before class");
	}
	
	@BeforeSuite
	void a()
	{
		System.out.println("this before suite");
	}
	
	@AfterSuite
	void b()
	{
		System.out.println("this After suite");
	}
}
