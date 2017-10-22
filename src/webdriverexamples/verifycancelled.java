package webdriverexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class verifycancelled {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://testingmasters.com/hrm/");
		driver.manage().window().maximize();
		
		//HRM login page
		driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys("user01");
		
		driver.findElement(By.id("txtPassword")).clear();
		driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
		
		driver.findElement(By.id("btnLogin")).click();
		
		WebElement leave= driver.findElement(By.id("menu_leave_viewLeaveModule"));
		Actions obj= new Actions(driver);
		obj.moveToElement(leave).build().perform();
		driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();
		//fromdate
		driver.findElement(By.xpath(".//*[@id='frmFilterLeave']/fieldset/ol/li[1]/img")).click();
		WebElement dropdown= driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[1]"));
		Select month= new Select(dropdown);
		month.selectByVisibleText("Jan");
		
		Select year= new Select(driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[2]")));
		year.selectByVisibleText("2017");
		
		driver.findElement(By.linkText("2")).click();
		
		//todate
		driver.findElement(By.xpath(".//*[@id='frmFilterLeave']/fieldset/ol/li[1]/img")).click();
		WebElement drop= driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[1]"));
		Select month1= new Select(drop);
		month1.selectByVisibleText("Apr");
		
		Select year1= new Select(driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[2]")));
		year1.selectByVisibleText("2017");
		
		driver.findElement(By.linkText("10")).click();
		
		//clear all checkboxes
		driver.findElement(By.id("leaveList_chkSearchFilter_checkboxgroup_allcheck")).click();
		
		driver.findElement(By.xpath(".//input[@id='leaveList_chkSearchFilter_0']")).click();
		
		driver.findElement(By.xpath(".//*[@id='btnSearch']")).click();
		
		
		
		
	}

}
