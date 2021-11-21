package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTitleactitime {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://demo.actitime.com/login.do");
		d.findElement(By.partialLinkText("actiTIME Inc.")).click();
		Set<String> whs = d.getWindowHandles();
		for(String titles:whs)
		{
			d.switchTo().window(titles);
			String alltitles = d.getTitle();
			System.out.println(alltitles);
		}
		d.quit();
	}
}
