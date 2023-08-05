package com.stepDefinations;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {

	public static WebDriver driver;

	@Given("OrangeHrm Url has been provided")
	public void orange_hrm_url_has_been_provided() 
	{
      driver = new ChromeDriver();
      
      driver.get("https://phptravels.net/admin/login.php");
      driver.manage().window().maximize();
      try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	@When("user enters Credentials to Login")
	public void user_enters_credentials_to_login(DataTable usercredentials) {
		
		List<List<String>>user = usercredentials.asLists(String.class);
        for (List<String >data : user) {
 
            driver.findElement(By.xpath("//input[@id='email']")).sendKeys(data.get(0));
 
           
            driver.findElement(By.xpath("//input[@id='password']")).sendKeys(data.get(1));
 
            driver.findElement(By.xpath("//button[@id='submit']")).submit();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.findElement(By.xpath("//a[@id='dropdownUser1']")).click();
            driver.findElement(By.linkText("Logout")).click();
		}

	}

	@When("user click on Submit button")
	public void user_click_on_submit_button() {
		System.out.println("Login button Click");
	}

	@Then("user can able to login successfully.")
	public void user_can_able_to_login_successfully() {
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		System.out.println("User successfully Login");
	}

}
