package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void testVerifyTitle()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String expectedtitle="Soogle";
		String actualtitle=driver.getTitle();
		/*1if(actualtitle.equals(expectedtitle))
		{
			Reporter.log("Title is matching so pass",true);
		}
		else
		{
			Reporter.log("Title is not matching so failed",true);
		}*/
		//2Assert.assertEquals(actualtitle, expectedtitle);
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualtitle, expectedtitle);
		driver.close();
		s.assertAll();
	}
}
