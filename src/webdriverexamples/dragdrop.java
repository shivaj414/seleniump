package webdriverexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dragdrop {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.jqueryui.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.partialLinkText("Droppable")).click();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement source= driver.findElement(By.id("draggable"));
		WebElement target= driver.findElement(By.id("droppable"));
		
		Thread.sleep(20000);
		WebDriverWait wait= new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("draggable")));
		Actions obj= new Actions(driver);
		obj.dragAndDrop(source, target).build().perform();
		//obj.clickAndHold(source).moveToElement(target).build().perform();
		
	}

}
