package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLoginButtonEnabled {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		boolean login = d.findElement(By.name("login")).isEnabled();
		if(login==true)
			System.out.println("login button is enabled");
		else
			System.out.println("login button is disabled");
		d.close();
	}

}
