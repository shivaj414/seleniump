package webdriverexamples;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cookie {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://flipkart.com");
		driver.manage().deleteAllCookies();
		
		Cookie mycookie = new Cookie("mycookie", "123456789123");
		driver.manage().addCookie(mycookie);
		
		
                // After adding the cookie we will check that by displaying all the cookies.
		Set<Cookie> cookiesList =  driver.manage().getCookies();
		for(Cookie c :cookiesList) {
		    System.out.println(c );
	}

}
}
