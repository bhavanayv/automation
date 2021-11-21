package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CareInsurance {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		d.findElement(By.xpath("//input[@name='policynumber']")).sendKeys("123");
	//	Thread.sleep(3000);
		d.findElement(By.xpath("//input[@name='dob']")).click();
	//	Thread.sleep(3000);
		WebElement monthlistbox = d.findElement(By.className("ui-datepicker-month"));
		Select month=new Select(monthlistbox);
		month.selectByVisibleText("Sep");
	//	Thread.sleep(3000);
		WebElement yearlistbox = d.findElement(By.className("ui-datepicker-year"));
		Select year=new Select(yearlistbox);
		year.selectByVisibleText("1996");
	//	Thread.sleep(3000);
		d.findElement(By.xpath("//a[.='1']")).click();
	//	Thread.sleep(3000);
		d.findElement(By.xpath("//input[@class='form-control ']")).sendKeys("9845798457");
	//	Thread.sleep(3000);
		d.findElement(By.xpath("//button[@class='submit-login']")).submit();
	}
}
