package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchronization1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@type ='text']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text() ='Login ']")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("logout")).click();
	}
}