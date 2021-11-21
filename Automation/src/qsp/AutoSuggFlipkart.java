package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggFlipkart {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args)  {
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://www.flipkart.com/");
		d.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone");
		List<WebElement> autosugg = d.findElements(By.xpath("//a[@class='_3izBDY']"));
		int count=autosugg.size();
		System.out.println(count);
		for(WebElement allsugg:autosugg)
		{
			String text=allsugg.getText();
			System.out.println(text);
		}
		d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		autosugg.get(count-1).click();
		d.quit();
	}
}
