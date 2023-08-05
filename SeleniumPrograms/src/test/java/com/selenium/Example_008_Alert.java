package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_008_Alert {

	static WebDriver driver;

	public static void main(String[] args) {
		LaunchBrowser();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		deleteData();

	}

	public static void LaunchBrowser() {
		driver = new ChromeDriver();

		driver.get("https://phptravels.net/admin/dashboard.php");

		// Want to maximize window => manage window size
		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));

		username.sendKeys("admin@phptravels.com");

		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));

		password.sendKeys("demoadmin");

		WebElement loginButton = driver.findElement(By.xpath("//button[@id ='submit']"));
		loginButton.click();

	}

	
	public static void deleteData() {
		driver.get("https://phptravels.net/admin/hotels.php");
	WebElement deletebutton 	 =driver.findElement(By.xpath("//table/tbody/tr[1]/td[10]/span/a[2]"));
	deletebutton.click();
	//how to handle alert in selenium
	
	Alert a = driver.switchTo().alert();
	System.out.println(a.getText());
	// Alert is having 2 methods accept() dismiss()
	
	//a.accept();To accept warning .
	
	try {
		Thread.sleep(7000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	a.dismiss();// To reject warning or you can say cancel 
		
	}
}
