package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WiproAllURL {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://www.google.com/");
		d.findElement(By.name("q")).sendKeys("Wipro jobs"+Keys.ENTER);
		//d.findElement(By.xpath("(//input[@value='Google Search'])[1]")).submit();	
		List<WebElement> list = d.findElements(By.partialLinkText("ipro"));
		int count=list.size();
		System.out.println(count);
		for(WebElement urls:list)
		{
			String URLlist = urls.getAttribute("href");
			System.out.println(URLlist);
		}
		d.close();
	}
}


	//	driver.findElement(By.name("q")).sendKeys("wipro jobs"+Keys.ENTER);
		//List<WebElement> allLinks = driver.findElements(By.xpath("//a[contains(.,'ipro')]"));
	//	int count = allLinks.size();
	//	System.out.println(count);
	//	for(WebElement allUrl:allLinks) {
	////		String url = allUrl.getAttribute("href");
		//	System.out.println(url);
	//	}
	//	driver.close()
