package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_003_InspectingWebElementById {
static WebDriver driver;
	public static void main(String[] args) {
		launchBrowser();
		//Explicit wait 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		login();
		
		
	
	}
	
	public static void launchBrowser() 
	{
		driver = new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		// Want to maximize window => manage window size
		driver.manage().window().maximize();
	}
	
	public static void login() {
		
		//WebElement username = driver.findElement(By.id("email"));
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		
		//
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("admin123");
		
		
		
		WebElement loginButton =driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();
	}
	
	
	
    
}
