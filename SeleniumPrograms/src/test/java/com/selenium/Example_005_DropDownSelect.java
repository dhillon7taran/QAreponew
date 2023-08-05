package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example_005_DropDownSelect {
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
		driver.get("https://www.orangehrm.com/en/30-day-free-trial/");
		driver.manage().window().maximize();
	}

	public static void selectvaluefromdropdown() {
		// Select value from the dropdown
		WebElement countryName = driver.findElement(By.id("Form_getForm_Country"));
		// able to locate the position of WebElement
		Select s = new Select(countryName);
		// Select tag is always run with my option tag
		// 1. SelectByIndex
		// 2. SelectByValue=> this value belongs to the database
		// 3. SelectByvisibleText
		// s.selectByVisibleText("Togo");
		// s.selectByIndex(0);// Algeria has index position 3
		// s.selectByValue("Venezuela");
// Second Test Cases : I need to print count of countries and name of all the countries from the dropdown
		List<WebElement> allOptions = s.getOptions();
		System.out.println(allOptions.size());
		
		  for (WebElement CountriesList : allOptions) {
			  if(CountriesList.getText().equals("Cuba")) {
				  CountriesList.click();
				  break;
				  
			  }
		  System.out.println(CountriesList.getText()); }
		 System.out.println("Printing all countries name without selected value");
		for(int i=1; i<allOptions.size(); i++) {
			System.out.println(allOptions.get(i).getText());
		}

	}

}
