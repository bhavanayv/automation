package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestio1for {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		d.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(2000);
		List<WebElement> autosugg = d.findElements(By.xpath("//span[contains(.,'java')]"));
		int count = autosugg.size();
		System.out.println(count);
		for(WebElement sugg:autosugg)
		{
			System.out.println(sugg.getText());
		}
		autosugg.get(0).click();
		d.close();
	}
}
