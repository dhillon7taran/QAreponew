package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;

	}

	// locators OR

	By username = By.xpath("//input[@name = 'username']");

	By password= By.xpath("//input[@name = 'password']");

	By loginButton = By.xpath("//button[@type = 'submit']");
	
	
	public void enterUserName(String user) 
	{
		driver.findElement(username).sendKeys(user);
		
	}
	
	
	public void enterPassword(String pwd) 
	{
		
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void LoginButton() 
	{
		driver.findElement(loginButton).click();
		
	}
	

}
