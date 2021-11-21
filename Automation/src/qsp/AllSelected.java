package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllSelected {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("file:///C:/Users/user/OneDrive/Desktop/Hoteldemo.html");
		WebElement slvlistbox = d.findElement(By.id("slv"));
		Select s=new Select(slvlistbox);
		List<WebElement> alloptions = s.getAllSelectedOptions();
		int count=alloptions.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String text=alloptions.get(i).getText();
			System.out.println(text);
		}
		d.close();
	}
}
