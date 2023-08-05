package com.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Example_009_HowToTakeScreenshot {

	static WebDriver driver;

	public static void main(String[] args) throws Exception 
	{
		LaunchBrowser();
		Thread.sleep(5000);
		
		
	}

	public static void LaunchBrowser() throws IOException {
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
		
		File srcFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destFile = new File("E:\\Taranjot\\Screenshot\\dummy.jpeg");
		
		FileHandler.copy(srcFile, destFile);

	}

	
	/*public static void deleteData() throws Exception {
		driver.get("https://phptravels.net/admin/hotels.php");
	WebElement deletebutton 	 =driver.findElement(By.xpath("//table/tbody/tr[1]/td[10]/span/a[2]"));
	deletebutton.click();
	//how to handle alert in selenium
	
	Alert a = driver.switchTo().alert();
	System.out.println(a.getText());
	// Alert is having 2 methods accept() dismiss()
	
	a.accept();
	
	//TakesScreenshot is an interface which is responsible to capture screen
	
	
	try {
		Thread.sleep(7000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}
	//a.dismiss();// To reject warning or you can say cancel 
	

	
	
	// manual steps to takescreenshot 
	// 1. you can press printscreen from your keyboard
	// 2. you will be going to save the printscreen in dedicated folder
	*/
	
	
		
	

}

