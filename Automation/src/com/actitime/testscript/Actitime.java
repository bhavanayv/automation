package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.bhavana.generic.BaseClassActitime;

public class Actitime extends BaseClassActitime {
	@Test
	public void createCustomer() 
	{
		Reporter.log("createcustomer", true);
	}

	@Test
	public void del() 
	{
		Reporter.log("delete", true);
	}
	public void modifyCustomer() 
	{
		Reporter.log("modify", true);
	}
}
