package com.bhavana.generic;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("openBrowser",true);
	}
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("closeBrowser",true);
	}
	@BeforeMethod
	public void login() {
		Reporter.log("login",true);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout", true);
	}
}
