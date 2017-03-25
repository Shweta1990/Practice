package testngprac;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

public class B {
	
	@BeforeMethod
	public void Bmet()
	{
		System.out.println("Before");
	}
	
	@AfterMethod
	public void Amet()
	{
		System.out.println("After");
	}
	
	@Test
	public void test()
	{
		System.out.println("Hello World");
	}

}
