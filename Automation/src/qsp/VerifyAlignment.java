package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAlignment {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://demo.actitime.com/login.do");
		int x1 = d.findElement(By.id("username")).getLocation().getX();
		int x2 = d.findElement(By.name("pwd")).getLocation().getX();
		if(x1==x2)
			System.out.println("UN and PW textbox are aligned");
		else
			System.out.println("UN and PW textbox are not aligned");
		d.close();
	}	
}
