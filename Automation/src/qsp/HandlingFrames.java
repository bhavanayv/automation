package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("file:///C:/Users/user/OneDrive/Desktop/Page1.html");
		d.switchTo().frame(0);
		d.findElement(By.id("t2")).sendKeys("jsp");
		d.switchTo().parentFrame();
		Thread.sleep(4000);
		d.findElement(By.id("t1")).sendKeys("qsp");
	}
}
