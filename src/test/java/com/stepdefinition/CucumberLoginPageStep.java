package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CucumberLoginPageStep {
	WebDriver driver;

	@Given("User is on the AdactinHotel Page")
	public void a() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@When("User should enter username and password")
	public void b() {
	WebElement txtUserName=driver.findElement(By.id("email"));
	txtUserName.sendKeys("Sana");
	WebElement txtPassword = driver.findElement(By.id("pass"));
	txtPassword.sendKeys("Hello");
		
	}

	@When("User should click login button")
	public void c() {
		WebElement btnLogin= driver.findElement(By.id("login"));
		btnLogin.click();
	}
	@Then("User should verify success")
	public void d() {
		String title = driver.getTitle();
		Assert.assertTrue("VerifyTitle", title.contains("Login"));
		driver.quit();
	}

}
