package webdriverexamples;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class multiplebrowser {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		WebDriver driver= null;
		System.out.println("enter browser type: IE or FF or chrome");
		Scanner sc= new Scanner(System.in);
		String brtype=sc.next();
		brtype= brtype.toUpperCase();
		
		switch(brtype)
		{
		case "FF":
			driver= new FirefoxDriver();
			break;
			
		case "IE":
			System.setProperty("webdriver.IE.driver", "D:\\IEdriverserver.exe");
			driver= new InternetExplorerDriver();
			break;
			
			
		
			
		}
		

	}

}
