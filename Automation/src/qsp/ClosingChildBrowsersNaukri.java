package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingChildBrowsersNaukri {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://www.naukri.com/");
		String pwh=d.getWindowHandle();
		Set<String> whs = d.getWindowHandles();
		for(String allwhs:whs)
		{
			d.switchTo().window(allwhs);
			if(pwh.equals(allwhs))
			{
				
			}
			else
			{
				d.close();
			}
		}
	}
}
