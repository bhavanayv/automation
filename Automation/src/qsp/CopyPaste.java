package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPaste {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("http://demo.opensourcebilling.org/");
		d.findElement(By.id("email")).sendKeys(Keys.CONTROL+"a"+"c");//"ac"
		Thread.sleep(4000);
		d.findElement(By.id("password")).sendKeys(Keys.CONTROL+"a"+"v");
	}

}
