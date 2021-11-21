package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("file:///C:/Users/user/OneDrive/Desktop/Hoteldemo.html");
		WebElement mtrlistbox = d.findElement(By.id("mtr"));
		Select s=new Select(mtrlistbox);
		s.selectByIndex(0);
		Thread.sleep(3000);
		s.selectByValue("v");
		Thread.sleep(3000);
		s.selectByVisibleText("dosa");
		Thread.sleep(3000);
		//s.deselectAll();
		s.deselectByIndex(2);
		s.deselectByVisibleText("idly");
		s.deselectByVisibleText("dosa");
		d.close();
	}
	
}
