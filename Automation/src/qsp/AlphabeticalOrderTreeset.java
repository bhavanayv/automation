package qsp;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlphabeticalOrderTreeset {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<>();
		WebDriver d = new ChromeDriver();
		d.get("file:///C:/Users/user/OneDrive/Desktop/Hoteldemo.html");
		WebElement mtrlistbox = d.findElement(By.id("mtr"));
		Select s=new Select(mtrlistbox);
		List<WebElement> alloptns = s.getOptions();
		int count=alloptns.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String text=alloptns.get(i).getText();
			ts.add(text);
		}
		for(String text:ts)
		{
			System.out.println(text);
		}
		d.close();
	}
}
