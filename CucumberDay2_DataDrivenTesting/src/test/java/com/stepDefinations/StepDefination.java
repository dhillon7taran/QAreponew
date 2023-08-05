package com.stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {

	public static WebDriver driver;

	@Given("OrangeHrm Url has been provided")
	public void orange_hrm_url_has_been_provided() {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("user enters {string} And {string}")
	public void user_enters_and(String uname, String pwd) {
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(uname);

		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(pwd);

	}

	@When("user click on Submit button")
	public void user_click_on_submit_button() {
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();
	}

	@Then("user can able to login successfully.")
	public void user_can_able_to_login_successfully() {
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		System.out.println("User successfully Login");
	}

}
