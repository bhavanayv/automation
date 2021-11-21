package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.bhavana.generic.BaseClassActitime;

@Listeners(com.bhavana.generic.ListenerImplementation.class)
public class DemoGroupExecution extends BaseClassActitime{
@Test(groups= {"RegressionTest","SmokeTest"})
public void createCustomer()
{
	Reporter.log("createCustomer",true);
}
@Test(groups= "RegressionTest")
public void deleteCustomer()
{
	Reporter.log("deleteCustomer",true);
}
@Test(groups= "RegressionTest")
public void modifyCustomer()
{
	Reporter.log("modifyCustomer",true);
}
}
