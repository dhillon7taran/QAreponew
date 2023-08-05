package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_002_GetPageTitle {
static WebDriver driver;
	public static void main(String[] args) {
		launchBrowser();
		
		getPageTitle();
		
		//getPageSource();
		
		getCurrentURL();
	
	}
	
	public static void launchBrowser() 
	{
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// Want to maximize window => manage window size
		driver.manage().window().maximize();
	}
	
	public static  void getPageTitle() 
	{
	String pageTitle =	driver.getTitle();
	System.out.println("Title of the page is :"+ pageTitle);
		
	}
	
	public static  void getPageSource() 
	{
	String pageSource = driver.getPageSource();
		System.out.println("The page Source of OrangeHRM is "+ pageSource);
	}
	
	public static  void getCurrentURL() 
	{
	String nameofURL = driver.getCurrentUrl();
	System.out.println("The name of current url is:"+ nameofURL);
		
	}
   
    
}
