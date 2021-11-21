package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoading {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		try 
		{
			d.get("https://demo.actitime.com/");
			System.out.println("Page is loaded within 7 seconds");
		}
		catch(Exception e)
		{
			System.out.println("Page is not loaded within 7 seconds");
		}
		d.close();
	}
}
