package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginActiTime {
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.get("https://demo.actitime.com/login.do");
	d.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
	d.findElement(By.xpath("//input[@type='text']")).click();
	d.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
	d.findElement(By.xpath("//input[@type='password']")).click();
	d.findElement(By.xpath("//div[text()='Login ']")).click();
}
}
