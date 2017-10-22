package webdriverexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class basics {

	public static void main(String[] args) {
	
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://testingmasters.com/hrm");
		driver.findElement(By.id("txtUsername")).sendKeys("user01");
		driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
		driver.findElement(By.name("Submit")).click();
		driver.get("https://google.co.in/");
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://facebook.com/");
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
		
		
		
		

	}

}
