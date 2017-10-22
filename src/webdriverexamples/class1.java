package webdriverexamples;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class class1 
{
/*	@Test
	public void Tc1()
	{
		System.out.println("Tc1 executed");
	}
	
	@Test
	public void Tc2()
	{
		System.out.println("tc2 executed");
	}
	@BeforeMethod
	public void m1()
	{
		System.out.println("before method executed");
	}
	
	@AfterMethod
	public void m2()
	{
		System.out.println("after method executed");
	}
*/
	@Test(priority=0)
	public void Tc2()
	{
		System.out.println("Tc2 executed");
	}
	@Test(priority=1)
	public void Tc1()
	{
		System.out.println("Tc1 executed");
	}
}
