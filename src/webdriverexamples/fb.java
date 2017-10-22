package webdriverexamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class fb {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.navigate().to("https://www.facebook.com/");
		WebElement ele= driver.findElement(By.id("email"));
		Actions obj= new Actions(driver);
	
		obj.contextClick(ele).build().perform();
		
		/*driver.findElement(By.id("email")).sendKeys("shivaji.d14@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("8978941135");
		driver.findElement(By.xpath("u_0_q")).click();
		
		
		
		List<WebElement> Links=driver.findElements(By.tagName("a"));
				 
		int n=Links.size();
		System.out.println(n);
		
		for(int i=0;i<=n;i++)
		{
			String linktext= Links.get(i).getText();
			System.out.println(linktext);
		}
		driver.quit();*/
		
		
		
	}

}
