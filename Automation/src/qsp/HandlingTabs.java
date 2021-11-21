package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabs {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.navigate().to("https://demo.actitime.com/");
		d.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> alltabs = d.getWindowHandles();
		int count=alltabs.size();
		System.out.println(count);
		d.quit();
	}

}
