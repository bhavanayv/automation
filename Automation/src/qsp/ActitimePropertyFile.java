package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimePropertyFile {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
		WebDriver d = new ChromeDriver();
		d.get("https://demo.actitime.com/");
		FileInputStream fis = new FileInputStream("./data/Demofile.property");
		Properties p = new Properties();
		p.load(fis);
		String un = p.getProperty("username");
		String pw = p.getProperty("password");
		d.findElement(By.xpath("//input[@type ='text']")).sendKeys(un);
		d.findElement(By.xpath("//input[@type='password']")).sendKeys(pw);
		d.findElement(By.xpath("//div[text() ='Login ']")).click();
	}
}