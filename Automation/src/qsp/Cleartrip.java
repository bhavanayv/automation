package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cleartrip {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		d.get("https://www.cleartrip.com/");
		d.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Bangalore");
		d.findElement(By.xpath("//p[contains(.,'Bangalore')]")).click();
		d.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("GOI");
		d.findElement(By.xpath("//p[contains(.,'Goa')]")).click();
	}
}
