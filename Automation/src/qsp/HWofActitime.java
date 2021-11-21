package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWofActitime {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://demo.actitime.com/login.do");
		Dimension un = d.findElement(By.name("username")).getSize();
		int h1 = un.getHeight();
		int w1 = un.getWidth();
		Dimension pw = d.findElement(By.name("pwd")).getSize();
		int h2=pw.getHeight();
		int w2=pw.getWidth();
		if(h1==h2)
		{
			if(w1==w2)
			{
				System.out.println("Dimensions are Equal");
			}
		}
		else
		{
			System.out.println("Dimensions are not equal");
		}
		d.close();
	}	
}
	
