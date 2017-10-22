package webdriverexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class fbsignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait('5',TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='u_0_3'][@class='inputtext _58mg _5dba _2ph-']")).sendKeys("shivaj");;
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("dod");;
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8985603643");
		
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("rajsri");
		 
		Select sel1= new Select(driver.findElement(By.xpath("//*[@name='birthday_day']")));
		sel1.selectByValue("30");
		
		Select sel2= new Select(driver.findElement(By.xpath("//*[@id='month']")));
		sel2.selectByVisibleText("Oct");
		
		Select sel3= new Select(driver.findElement(By.xpath("//*[@id='year']")));
		sel3.selectByIndex(6);
		
		driver.findElement(By.xpath("//input[@id='u_0_j']")).click();
		driver.findElement(By.xpath(".//*[@id='u_0_l']")).click();
		
		
		
		
		

	}

}
