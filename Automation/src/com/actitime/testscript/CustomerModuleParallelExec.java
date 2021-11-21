package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.bhavana.generic.BaseClassParallelCross;

public class CustomerModuleParallelExec extends BaseClassParallelCross{
	@Test
	public void createCustomer() throws InterruptedException
	{
		Reporter.log("createCustomer",true);
		Thread.sleep(2000);
	}
}
