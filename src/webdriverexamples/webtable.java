package webdriverexamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class webtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver();
		driver.get("http://testingmasters.com/hrm/");
		driver.manage().window().maximize();
		
		//HRM login page
		driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys("user01");
		
		driver.findElement(By.id("txtPassword")).clear();
		driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
		
		driver.findElement(By.id("btnLogin")).click();
		
		//navigate to myleave page
		
	 WebElement leave= driver.findElement(By.id("menu_leave_viewLeaveModule"));
		Actions obj= new Actions(driver);
		obj.moveToElement(leave).build().perform();
		driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();
		
		//get rowcount
		
		List<WebElement> rows= driver.findElements(By.xpath("//table[@id='resulttable']/tbody/tr"));
		int rowcount = rows.size();
		
		//get colummncount
		
		List <WebElement> cols= driver.findElements(By.xpath("//table[@id='resulttable']/tbody/tr[1]/td"));
		int colcount = cols.size();
		
		System.out.println("rowcount is:" +rowcount+ "; colcount is:" +colcount);
		
		//get webtable cell value
		
		WebElement cell = driver.findElement(By.xpath("//table[@id='resulttable']/tbody/tr[2]/td[6]"));
		System.out.println("cell value is:" +cell.getText());
		
	}

}
