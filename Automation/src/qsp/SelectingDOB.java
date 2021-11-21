package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectingDOB {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://en-gb.facebook.com/");
		d.findElement(By.linkText("Create New Account")).click();
		WebElement daylistbox = d.findElement(By.id("day"));
		Select day=new Select(daylistbox);
		day.selectByValue("1");
		WebElement monthlistbox = d.findElement(By.id("month"));
		Select month=new Select(monthlistbox);
		month.selectByVisibleText("Sep");
		WebElement yearlistbox = d.findElement(By.id("year"));
		Select year=new Select(yearlistbox);
		year.selectByVisibleText("1996");
	}
}
