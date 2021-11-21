package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFramesbyenteringChars {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("file:///C:/Users/user/OneDrive/Desktop/Page1.html");
		d.switchTo().frame(0);
		d.findElement(By.id("t2")).sendKeys("a");
		d.switchTo().parentFrame();
		d.findElement(By.id("t1")).sendKeys("d");
		d.switchTo().frame("f1");
		d.findElement(By.id("t2")).sendKeys("b");
		d.switchTo().defaultContent();
		d.findElement(By.id("t1")).sendKeys("e");
		WebElement frame = d.findElement(By.xpath("//iframe"));
		d.switchTo().frame(frame);
		d.findElement(By.id("t2")).sendKeys("c");
	}
}
