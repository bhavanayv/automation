package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifySubmitInOpenSourceBillingApp {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("http://demo.opensourcebilling.org/");
		Thread.sleep(4000);
		d.findElement(By.id("user_login_btn")).submit();
	}

}