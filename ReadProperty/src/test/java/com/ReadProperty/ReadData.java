package com.ReadProperty;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadData

{

	WebDriver driver;
	FileInputStream fs;
	Properties prop;

	public void readFile() throws IOException {

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		String path = "E:\\Taranjot\\ReadProperty\\src\\test\\resources\\Data.properties";

		try {
			fs = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		prop = new Properties();

		prop.load(fs);

		driver.get(prop.getProperty("URL"));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// Implicit wait => Compulsory wait for 30 seconds

		// Explicit Wait => certain condition occurs before proceeding with executing
		// code. Thread.sleep(5000)
		// allows the program to pause for dynamically loaded AJax Element

		driver.findElement(By.xpath(prop.getProperty("UsernameXpath"))).sendKeys(prop.getProperty("UserNameValue"));

		driver.findElement(By.xpath(prop.getProperty("PasswordXpath"))).sendKeys(prop.getProperty("PasswordValue"));

		driver.findElement(By.xpath(prop.getProperty("LoginButtonXpath"))).click();

	}
}
