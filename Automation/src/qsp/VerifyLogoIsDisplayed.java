package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogoIsDisplayed {
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		boolean logo = d.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
		if(logo==true)
		{
			System.out.println("logo is displayed");
		}
		else
		{
			System.out.println("logo is not displayed");
		}
		d.close();
	}
}
