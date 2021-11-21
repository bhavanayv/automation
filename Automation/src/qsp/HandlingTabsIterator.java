package qsp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabsIterator {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://demo.actitime.com/login.do");
		d.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> allwh = d.getWindowHandles();
		Iterator<String> itr=allwh.iterator();
		String pwh=itr.next(); // allWh.iterator().next();
		String cwh=itr.next();
		Thread.sleep(2000);
		d.switchTo().window(cwh);
		d.close();
	//	Thread.sleep(2000);
		d.switchTo().window(pwh);
		d.close();
	}
}


		

