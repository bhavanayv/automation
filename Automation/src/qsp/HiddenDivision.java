package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivision {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		//d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		d.findElement(By.xpath("(//button)[2]")).click();;
	}
}
