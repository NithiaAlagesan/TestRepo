package com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	//Encapsulation= data +Method

	private WebDriver driver;

	public HomePage(WebDriver driver) // from base class
	{
		this.driver = driver;	
	}

	//By locator

	private By signIn = By.id("SignIn");

	//method

	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}

	public String getAppTitle()
	{
		return driver.getTitle();
	}

	public void getSignIn()
	{
		driver.findElement(signIn).click();
	}


}
