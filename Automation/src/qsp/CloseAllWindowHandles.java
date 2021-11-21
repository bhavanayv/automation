package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllWindowHandles {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://www.naukri.com/");
		Set<String> whs = d.getWindowHandles();
		for(String allwh:whs)
		{
			Thread.sleep(2000);
			d.switchTo().window(allwh);
			d.close();
		}
	}
}
