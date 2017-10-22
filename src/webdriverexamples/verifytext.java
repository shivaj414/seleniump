package webdriverexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class verifytext {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://testingmasters.com/hrm/");
		driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys("user01");
		
		driver.findElement(By.id("txtPassword")).clear();
		driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
		
		driver.findElement(By.id("btnLogin")).click();
		/*
		String exptext= "Welcome";
		String acttext= driver.findElement(By.xpath("//*[contains(text(),'Welcome')]")).getText();
		if(acttext.contains(exptext))
			System.out.println("pass");
		else
			System.out.print("fail");
			
		String pagecontent = driver.getPageSource();
		System.out.println(pagecontent);
		if(pagecontent.contains("Dashboard"));
		System.out.println("pass");
		else
			System.out.print("fail");
			*/
		if(driver.findElement(By.xpath("//*[@id='content']/div/div[1]/h1")).isDisplayed());
		
		System.out.println("pass");
		
			System.out.print("fail");
		
		
		
		

	}

}
