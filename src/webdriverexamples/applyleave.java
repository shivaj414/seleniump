package webdriverexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class applyleave {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://testingmasters.com/hrm/");
		driver.findElement(By.id("txtUsername")).sendKeys("user01");
		driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
		driver.findElement(By.id("btnLogin")).click();


	WebElement leave=	driver.findElement(By.id("menu_leave_viewLeaveModule"));
	Actions obj= new Actions(driver);
	obj.moveToElement(leave).build().perform();
	driver.findElement(By.id("menu_leave_applyLeave")).click();
	
	Select sel1=new Select(driver.findElement(By.id("applyleave_txtLeaveType")));
	sel1.selectByVisibleText("Personal Leave");
	
	driver.findElement(By.id("applyleave_txtFromDate")).click();
	Select sel2 = new Select(driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[1]")));
	sel2.selectByVisibleText("May");
	
	Select sel3= new Select(driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[2]")));
	sel3.selectByVisibleText("2017");
	
	driver.findElement(By.linkText("13")).click();
	
	
	Thread.sleep(3000);
	driver.findElement(By.xpath(".//*[@id='applyleave_txtToDate']")).click();
	Select sel4 = new Select(driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[1]")));
	sel4.selectByVisibleText("May");
	
	Select sel5= new Select(driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[2]")));
	sel5.selectByVisibleText("2017");
	driver.findElement(By.linkText("16")).click();
	
	Thread.sleep(3000);
	Select day = new Select(driver.findElement(By.id("applyleave_duration_duration")));
	day.selectByVisibleText("half_day");

	
	
	//driver.findElement(By.id("applyleave_txtComment")).sendKeys("personal ");
	
		
	
	driver.findElement(By.id("applyBtn")).click();
	
	
	
	
	
	
	
	
			
	}

}
