package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.actitime.pom.CheckBoxPage;

public class AllCheckbox {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void testCheckBox() {
		WebDriver driver=new ChromeDriver();
		driver.get("");
	//	WebElement allcheck = driver.findElement(By.xpath("//input[@type='checkbox']"));
	//	int count = allcheck
	//	for(int i=0;i<
		CheckBoxPage c=new CheckBoxPage(driver);
		c.setCheckBoxClick();
	}
}
