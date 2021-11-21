package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTitlesOfAllWindowHandles {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://www.naukri.com/");
		Set<String> whs = d.getWindowHandles();
		for(String allwh:whs)
		{
			d.switchTo().window(allwh);
			String titles=d.getTitle();
			System.out.println(titles);
		}
		d.quit();
	}
}
