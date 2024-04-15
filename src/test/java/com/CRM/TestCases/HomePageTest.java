package com.CRM.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass
{
	@Test(priority=1)
	public void VerifyUrl() 
	{

		String curl=hp.getAppUrl();
		Assert.assertTrue(curl.contains("crm"), "Url is Wrong!");
		System.out.println("Url is Valid: " +hp.getAppUrl());
	}
	
	@Test(priority=2)
	public void VerifyTitle()
	{
		
		Assert.assertTrue(hp.getAppTitle().contains("Service"), "Title is Not Matched!");
		System.out.println("Title is Matched: " + hp.getAppTitle());
	}

	@Test(priority=3)
	public void VerifySignIn() 
	{
		hp.getSignIn();
		Assert.assertTrue(hp.getAppUrl().contains("login"), "TestFail-Login Page Not open!");
		System.out.println("Test Pass:Login Page Gets Open ");
		
	}

}
