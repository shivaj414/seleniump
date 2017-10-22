package webdriverexamples;

import java.time.Year;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdrownitems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Select s_drop = new Select(driver.findElement(By.id("year")));
		/*
		WebElement result= s_drop.getFirstSelectedOption();
		System.out.println(result.getText());
		*/
	List<WebElement> years = s_drop.getOptions();
	System.out.println("total no.of years:" +years.size());
	
	for(WebElement itm: years)
	{
		String str= itm.getText();
		System.out.println(str);
		
	}
		

	}

}
