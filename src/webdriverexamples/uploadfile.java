package webdriverexamples;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class uploadfile {

	public static void main(String[] args) throws IOException, InterruptedException 
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
		
		WebElement myinfo= driver.findElement(By.xpath(".//*[@id='menu_pim_viewMyDetails']/b"));
		Actions obj= new Actions(driver);
		obj.moveToElement(myinfo).build().perform();
		myinfo.click();
		driver.findElement(By.id("btnAddAttachment")).click();
		driver.findElement(By.xpath(".//*[@id='ufile']")).click();
		
		Runtime.getRuntime().exec("F:/fileupload.exe");
		Thread.sleep(8000);
		driver.findElement(By.id("btnSaveAttachment")).click();
		
		
		
		

	}

}
