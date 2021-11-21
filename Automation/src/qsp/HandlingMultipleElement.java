package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElement {
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.get("file:///C:/Users/user/OneDrive/Desktop/multiple%20elements%20demo.html");
	List<WebElement> allLinks = d.findElements(By.tagName("a"));
	int count=allLinks.size();
	System.out.println(count);
	for(int i=0;i<count;i++)
	{
		WebElement link = allLinks.get(i);
		String text=link.getText();
		System.out.println(text);
	}
	//WebElement link = allLinks.get(0);
	//String text=link.getText();
	//text=allLinks.get(0).getText();
	//System.out.println(text);
	d.close();
}
}
