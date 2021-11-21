package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 {
	@BeforeMethod
	public void login() {
		Reporter.log("login",true);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout", true);
	}
	@Test
	public void createCustomer()
	{
		Reporter.log("createCustomer", true);
	}
	@Test
	public void deleteCustomer()
	{
		Reporter.log("deleteCustomer", true);
	}
}
