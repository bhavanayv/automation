package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.bhavana.generic.BaseClassActitime;

public class CustomerModuleRegionalRegTesting extends BaseClassActitime{
	@Test
	public void createCustomer()
	{
		Reporter.log("createCustomer",true);
	}
	@Test
	public void deleteCustomer()
	{
		Reporter.log("deleteCustomer",true);
	}
	@Test
	public void modifyCustomer()
	{
		Reporter.log("modifyCustomer",true);
	}
	
}
