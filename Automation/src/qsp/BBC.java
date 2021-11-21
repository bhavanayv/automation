package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBC {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://www.bbc.com/");
		List<WebElement> list = d.findElements(By.xpath("//span[@class='top-list-item__bullet']/../h3"));
		int count=list.size();
		System.out.println(count);
		for(WebElement top5:list)
		{
			String text=top5.getText();
			System.out.println(text);
		}
		d.close();
	}
}
