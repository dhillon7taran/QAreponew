package com.selenium;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example_010_multiselectDropdown {

	// This example will explain how to choose multiselect value from dropdown

	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		LaunchBrowser();
		Thread.sleep(5000);

	}

	public static void LaunchBrowser() throws IOException {
		driver = new ChromeDriver();

		driver.get("C:/Users/Admin/Desktop/multidropdown.html");

		// Want to maximize window => manage window size
		driver.manage().window().maximize();

		WebElement carElements = driver.findElement(By.id("cars"));

		Select s = new Select(carElements);

		s.selectByIndex(3);

		s.selectByVisibleText("Volvo");

		s.selectByValue("opel");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// s.deselectByValue("opel");

		// s.deselectAll();

		List<WebElement> selectedCars = s.getAllSelectedOptions();

		for (WebElement carsList : selectedCars) {

			// System.out.println(carsList.getText());

			System.out.println(carsList.getAttribute("Value"));
		}

	}

}
