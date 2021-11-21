package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.bhavana.generic.BaseClassActitime;

@Listeners(com.bhavana.generic.ListenerImplementation.class)
public class CustomerModulewithListener extends BaseClassActitime {
@Test
public void createCustomer()
{
	Reporter.log("createCustomer",true);
	Assert.fail();
}
}
