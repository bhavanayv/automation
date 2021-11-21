package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ValidLogin {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void testValidLogin() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
	//	LoginPage l=new LoginPage(new ChromeDriver());
		LoginPage l=new LoginPage(driver);
		l.setLogin("admin1","manager1");
		Thread.sleep(3000);
		l.setLogin("admin","manager");
	}
}
