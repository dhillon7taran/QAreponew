package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example_006_FbDropdown {
	static WebDriver driver;

	public static void main(String[] args) {
		launchBrowser();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		selectvaluefromdropdown();
	}

	public static void launchBrowser() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

	public static void selectvaluefromdropdown() {

		WebElement newAccount = driver.findElement(By.linkText("Create new account"));
		newAccount.click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement day = driver.findElement(By.xpath("//*[@id ='day']"));

		
		
		

		Select s1 = new Select(day);
		s1.selectByVisibleText("10");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement month = driver.findElement(By.id("//*[@id='month']"));
		Select s2 = new Select(month); 
		s2.selectByValue("6");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement year = driver.findElement(By.id("//*[@id='year']"));
		Select s3 = new Select(year);
		 s3.selectByIndex(0);
		 

	}

}
