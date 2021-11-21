package qsp;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.get("https://demo.actitime.com/login.do");
		d.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		d.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		d.findElement(By.xpath("//div[.='Login ']")).click();
	//	d.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
		d.findElement(By.xpath("(//div[@class='popup_menu_icon'])[4]")).click();
		d.findElement(By.linkText("About your actiTIME")).click();
		Thread.sleep(2000);
		d.findElement(By.linkText("Read Service Agreement")).click();
		Set<String> wh = d.getWindowHandles();
		int count=wh.size();
		System.out.println(count);
		for(String tab:wh)
		{
			d.switchTo().window(tab);
		}
		List<WebElement> headings = d.findElements(By.xpath("//h2"));
		for(WebElement allHeadings:headings)
		{
			System.out.println(allHeadings.getText());
		}
		d.quit();
	}
}
		
