package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PdtPriceFlipkart {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args)  {
		WebDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.findElement(By.xpath("(//button)[2]"));
		//d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		d.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone 12"+Keys.ENTER);
		List<WebElement> pdtlist = d.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> pricelist = d.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		int countpdt=pdtlist.size();
		int countprice=pricelist.size();
		System.out.println(countpdt);
		System.out.println(countprice);
		//for(WebElement alllinks:list)
		//{
			//String text=alllinks.getText();
			//System.out.println(text);
		//}
		for(int i=0;i<countpdt;i++)
		{
			String textpdt=pdtlist.get(i).getText();
			String textprice=pricelist.get(i).getText();
			System.out.println(textpdt+ "--->"+ textprice);
		}
		d.close();
	}
}

