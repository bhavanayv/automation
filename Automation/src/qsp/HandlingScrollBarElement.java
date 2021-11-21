package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBarElement {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://www.bbc.com/");
		int y = d.findElement(By.xpath("//span[.='Future Planet']")).getLocation().getY();
		JavascriptExecutor j=(JavascriptExecutor)d;
		j.executeScript("window.scrollBy(0,"+y+")");// we need to concatenate y, else it will take it as a string
	}
}

	