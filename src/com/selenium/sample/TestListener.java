package com.selenium.sample;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestListener extends Assert {

	@Test
	public void testCaseFail()
	{
		fail("FAIL");
	}
	
	@Test
	public void testCasePass(){
		assertTrue(true);
	}
	
	@Test
	public void testCaseNew(ITestContext context)
	{
		System.out.println(context.getCurrentXmlTest().getName());
	}
	
	@AfterMethod
	public void getStatus(ITestResult result)
	{
		System.out.println("Method Status: "+result.getStatus()+ " Method Name: "+result.getMethod().getMethodName());
		
	}
	
	
	
	
	
	
}
