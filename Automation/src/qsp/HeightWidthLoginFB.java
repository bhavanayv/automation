package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightWidthLoginFB {
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.get("https://www.facebook.com/");
	WebElement logbtn=d.findElement(By.name("login"));
	int height = logbtn.getSize().getHeight();
	int width = logbtn.getSize().getWidth();
	//Dimension logbtn1 = d.findElement(By.name("login")).getSize();
	//int height = logbtn1.getHeight();
	//int width = logbtn1.getWidth();
	//int height = d.findElement(By.name("login")).getSize().getHeight();
	//int width = d.findElement(By.name("login")).getSize().getWidth();
	System.out.println("height: "+height);
	System.out.println("width: "+width);
	d.close();
}
}
