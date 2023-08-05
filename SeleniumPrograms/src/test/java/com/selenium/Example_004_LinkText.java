package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_004_LinkText {
static WebDriver driver;
	public static void main(String[] args) {
		launchBrowser();
		
	}
	
	public static void launchBrowser() 
	{
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		
		// Want to maximize window => manage window size
		driver.manage().window().maximize();
		
		/*
		 * WebElement link = driver.findElement(By.linkText("Gmail")); link.click();
		 */
		
	    WebElement images =	driver.findElement(By.xpath("//*[@id='gb']/div/div[1]/div/div[2]/a"));
	     images.click();
	}
	
	
	
	
    
}
