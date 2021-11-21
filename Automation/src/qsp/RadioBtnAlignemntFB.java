package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtnAlignemntFB {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://en-gb.facebook.com/");
		d.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(3000);
		int y1 = d.findElement(By.xpath("(//input[@type='radio')[1]")).getLocation().getY();
		int y2 = d.findElement(By.xpath("(//input[@type='radio')[2]")).getLocation().getY();
		int y3 = d.findElement(By.xpath("(//input[@type='radio')[3]")).getLocation().getY();
		if(y1==y2 && y1==y3)
			System.out.println("radio buttons are aligned properly");
		else
			System.out.println("radio buttons are not aligned properly");
		d.close();
	}
}