package webdriverexamples;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class proprertieshandling 
{
	public static void main(String[] args) throws IOException   {
		// TODO Auto-generated method stub
		
		File f=new File("OR.properties");
		FileInputStream fip=new FileInputStream(f);
			
		Properties prop=new Properties();
		
		prop.load(fip);
		
		WebDriver driver=new FirefoxDriver();
		
		driver.navigate().to("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id(prop.getProperty("Username"))).sendKeys(prop.getProperty("uservalue"));
		driver.findElement(By.id(prop.getProperty("Password"))).sendKeys("pass1234");
		driver.findElement(By.id(prop.getProperty("login"))).click();
		
		
		
		

	}



}
