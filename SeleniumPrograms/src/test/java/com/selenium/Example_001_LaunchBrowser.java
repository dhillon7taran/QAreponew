package com.selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Example_001_LaunchBrowser {

	public static void main(String[] args) {

            // static => Sharable Object 

		// static methods accessible only static methods
		// static methods can not accessible with non static methods
		launchBrowser();

	}
	public static void launchBrowser() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		// Want to maximize window => manage window size
		driver.manage().window().maximize();
		// Set Screen resolution size
		//Dimension d = new Dimension(400, 214);
		int width = 102;
		int height = 600;
		driver.manage().window().setSize(new Dimension(width, height));
		//driver.quit();
		//close and quit
		// close will close current tab of browser
		// quit will close all tabs on single browsers
		
	}
	

}
