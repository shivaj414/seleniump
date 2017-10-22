package webdriverexamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class webtable2 {

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
			
			String date= "2017-05-31";
			int i=1,rownum=1;
			
			boolean datefound = false;
			for(i=1;i<=rowcount;i++)
			{
				WebElement cell= driver.findElement(By.xpath("//table[@id='resulttable']/tbody/tr["+i+"]/td[1]"));
				if(cell.getText().contentEquals(date))
				{
					rownum=i;
					datefound=true;
					break;
				}
			}
			if(datefound)
			{
		WebElement dropdown= driver.findElement(By.xpath("//table[@id='resulttable']/tbody/tr["+rownum+"]/td[8]/select"));
		Select obj1= new Select(dropdown);
		obj1.selectByVisibleText("cancel");
			}
			else{
				System.out.println("date not found");
			}
	}

}
