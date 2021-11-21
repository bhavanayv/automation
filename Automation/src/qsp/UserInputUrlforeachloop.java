package qsp;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserInputUrlforeachloop {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		System.out.println("Enter URL");
		Scanner s=new Scanner(System.in);
		String url = s.nextLine();
		WebDriver d=new ChromeDriver();
		d.get(url);
		List<WebElement> allLinks = d.findElements(By.tagName("a"));
		int count=allLinks.size();
		System.out.println(count);
		for(WebElement links:allLinks)
		{
			System.out.println(links.getText());
		}
		d.close();
	}
}
