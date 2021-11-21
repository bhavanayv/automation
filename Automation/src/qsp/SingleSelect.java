package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://en-gb.facebook.com/");
		d.findElement(By.linkText("Create New Account")).click();
		WebElement monthlistbox = d.findElement(By.id("month"));
		Select s=new Select(monthlistbox);
		s.selectByIndex(5);
		s.selectByValue("12");
		s.selectByVisibleText("Jan");
	}
}
