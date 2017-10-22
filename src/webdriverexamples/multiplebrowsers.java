package webdriverexamples;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multiplebrowsers {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub

		WebDriver driver= new FirefoxDriver();
		driver.get("http://ljsjobs.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='closeDiv']/div/div[1]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("FAQ")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("FeedBack")).click();
		
		String homepage= driver.getWindowHandle();
		Set<String> allhandles= driver.getWindowHandles();
		
		for(String handle1:allhandles)
		{
			driver.switchTo().window(handle1);
		String pageurl= driver.getCurrentUrl();
		if(pageurl.contains("FrequentlyAskedQuestions"));
		{
			System.out.println("switched to FAQ page");
			
		}
			
		}
		
		driver.switchTo().window(homepage);
		//driver.quit();
		
	}

}
