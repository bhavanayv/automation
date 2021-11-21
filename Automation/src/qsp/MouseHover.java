package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		d.get("https://www.vtiger.com/");
		Actions a=new Actions(d);
		WebElement restab = d.findElement(By.partialLinkText("Resources"));
		a.moveToElement(restab).build().perform();
		d.findElement(By.linkText("Contact Us")).click();
		String phonenum = d.findElement(By.xpath("//p[contains(text(),'Bengaluru')]/../p[2]")).getText();
		System.out.println(phonenum);
		d.close();
	}
}
