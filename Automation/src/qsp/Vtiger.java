package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Vtiger {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://www.vtiger.com/");
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions a=new Actions(d);
		WebElement restab = d.findElement(By.partialLinkText("Resources"));
		a.moveToElement(restab).perform();
		d.findElement(By.partialLinkText("Customers")).click();
		d.manage().window().maximize();
		WebElement cust = d.findElement(By.xpath("//a[.='READ FULL STORY']"));
		a.doubleClick(cust).perform();
		String title = d.getTitle();
		String t2="HackerEarth Case Study | Vtiger CRM";
		if(title.equals(t2))
		{
			System.out.println("HackerEarth page is displayed");
		}
		else
		{
			System.out.println("HackerEarth page is displayed");
		}
		d.quit();
	}
}
