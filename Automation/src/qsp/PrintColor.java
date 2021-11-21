package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintColor {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://en-gb.facebook.com/");
		WebElement link = d.findElement(By.linkText("Forgotten password?"));
		String color = link.getCssValue("color");
		System.out.println("color: "+color);
		String font = link.getCssValue("font-size");
		System.out.println("font-size: "+font);
		String font1 = link.getCssValue("font-family");
		System.out.println("font-family: "+font1);
		d.close();
	}
}
