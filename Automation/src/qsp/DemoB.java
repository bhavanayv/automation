package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class DemoB {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver.chromedriver.exe");
		System.setProperty("webdriver.msedge.driver","./driver.msedgedriver.exe");
	}

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		DemoA.test(driver);
		WebDriver driver1=new EdgeDriver();
		DemoA.test(driver1);
	}

}
