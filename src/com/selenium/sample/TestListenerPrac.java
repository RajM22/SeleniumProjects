package com.selenium.sample;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestListenerPrac extends Assert {

	/*@Test
	public void testCaseFail()
	{
		fail("Failed");
	}
	
	@Test
	public void passedTest()
	{
		assertTrue(true);
	}*/
	
	@Test
	public void newTest(ITestContext context)
	{
		System.out.println("Hey");
		//System.out.println(context.getCurrentXmlTest().getName());
	}
	
	
	
	
}
