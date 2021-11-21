package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws AWTException {
		WebDriver d = new ChromeDriver();
		d.get("https://demo.actitime.com/login.do");
		WebElement link = d.findElement(By.linkText("actiTIME Inc."));
		Actions a=new Actions(d);
		a.contextClick(link).build().perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_W);
		
	}

}
