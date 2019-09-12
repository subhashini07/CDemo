package com.stepefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TariffData {

	
	static WebDriver driver;

	@Given("user should be in home page")
	public void user_should_be_in_home_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SureshG\\subhaworkspace\\CumDemo\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom");

	}

	@Given("user should click tariff plans")
	public void user_should_click_tariff_plans() {
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();

	}
	@When("User chooses his tariff plans and enters data {string},{string},{string},{string},{string},{string},{string}")
	public void user_chooses_his_tariff_plans_and_enters_data(String Rental, String Local, String Inter, String SMS, String LocChar, String InterChar, String SMSChar) {
		driver.findElement(By.xpath("//input[@id='rental1']")).sendKeys(Rental);
		driver.findElement(By.id("local_minutes")).sendKeys(Local);
		driver.findElement(By.id("inter_minutes")).sendKeys(Inter);
		driver.findElement(By.id("sms_pack")).sendKeys(SMS);
		driver.findElement(By.id("minutes_charges")).sendKeys(LocChar);
		driver.findElement(By.id("inter_charges")).sendKeys(InterChar);
		driver.findElement(By.id("sms_charges")).sendKeys(SMSChar);

	}
	
	@When("User clicks on submit button")
	public void user_clicks_on_submit_button() {

		driver.findElement(By.name("submit")).click();
	}

	@Then("user should get displayed sucess message")
	public void user_should_get_displayed_sucess_message() {
		WebElement msg = driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']"));
		String txt = msg.getText();
		Assert.assertTrue("Verify Msg", txt.contains("Congratulation"));


}
}