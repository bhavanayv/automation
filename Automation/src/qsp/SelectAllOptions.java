package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAllOptions {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("file:///C:/Users/user/OneDrive/Desktop/Hoteldemo.html");
		WebElement mtrlistbox = d.findElement(By.id("mtr"));
		Select s=new Select(mtrlistbox);
		//int alloptions = s.getOptions().size();
		List<WebElement> alloptions = s.getOptions();
		int count=alloptions.size();
		for(int i=0;i<count;i++)
		{
			s.selectByIndex(i);
		}
		for(int i=count-1;i>=0;i--)
		{
			s.deselectByIndex(i);
		}
	}
}
