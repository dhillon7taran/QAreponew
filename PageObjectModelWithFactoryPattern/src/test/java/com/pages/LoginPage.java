package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
		// 6 usuage of java keyword
		
		/*
		 * 1. this can be used to refer current class instance variable   --- beginner
		 * 
		 * 2.this can be used to invoke current class method(implicitly)--- beginner
		 * 3. this can be used to return the current class instance from the method
		 * 
		 *  4. this can be passed as an argument in the method call
		 *  
		 *  5. this() can be used to invoke current class constructor --- Largely used and beginner
		 *  
		 *  6. this() can be passed as an argument in the constructor call
		 */ 
		PageFactory.initElements(driver, this);

	}

	// locators OR

	@FindBy(xpath = "//input[@name = 'username']")

	WebElement usernameElement;

	@FindBy(xpath = "//input[@name = 'password']")

	WebElement passwordElement;

	@FindBy(xpath = "//button[@type='submit']")

	WebElement loginButtonElement;

	public void enterUserName(String user) {
		usernameElement.sendKeys(user);

	}

	public void enterPassword(String pwd) {

		passwordElement.sendKeys(pwd);
	}

	public void LoginButton() {
		loginButtonElement.click();

	}

}
