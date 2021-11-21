package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestClassPOM {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void validLogin()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
	//	LoginPagePOM l=new LoginPagePOM(driver);
		LoginPagePOM l=new LoginPagePOM();
		PageFactory.initElements(driver, l);
		l.setLogin("admin", "manager");
	}
}
