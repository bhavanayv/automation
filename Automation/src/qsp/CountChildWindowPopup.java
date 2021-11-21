package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountChildWindowPopup {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://www.naukri.com/");
		Set<String> whs = d.getWindowHandles();
		int count=whs.size();
		System.out.println(count);
		d.quit();
	}
}
