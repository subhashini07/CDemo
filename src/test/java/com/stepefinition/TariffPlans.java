package com.stepefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class TariffPlans {
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

	@When("User chooses tariff plans")
	public void user_chooses_tariff_plans() {
		WebElement mntTar = driver.findElement(By.xpath("//input[@id='rental1']"));
		mntTar.sendKeys("250");
		WebElement freelclmin = driver.findElement(By.id("local_minutes"));
		freelclmin.sendKeys("1000");
		WebElement intrmin = driver.findElement(By.id("inter_minutes"));
		intrmin.sendKeys("700");
		WebElement Sms = driver.findElement(By.id("sms_pack"));
		Sms.sendKeys("300");
		WebElement lclcharge = driver.findElement(By.id("minutes_charges"));
		lclcharge.sendKeys("10");
		WebElement intrcharge = driver.findElement(By.id("inter_charges"));
		intrcharge.sendKeys("100");
		WebElement smscharge = driver.findElement(By.id("sms_charges"));
		smscharge.sendKeys("25");

	}

	@When("User choose tariff plans")
	public void user_choose_tariff_plans(io.cucumber.datatable.DataTable tariff) {
		List<String> datas = tariff.asList();
		driver.findElement(By.xpath("//input[@id='rental1']")).sendKeys(datas.get(0));
		driver.findElement(By.id("local_minutes")).sendKeys(datas.get(1));
		driver.findElement(By.id("inter_minutes")).sendKeys(datas.get(2));
		driver.findElement(By.id("sms_pack")).sendKeys(datas.get(3));
		driver.findElement(By.id("minutes_charges")).sendKeys(datas.get(4));
		driver.findElement(By.id("inter_charges")).sendKeys(datas.get(5));
		driver.findElement(By.id("sms_charges")).sendKeys(datas.get(6));

	}

	@When("User choose tariffs plans.")
	public void user_choose_tariffs_plans(DataTable plan) {
		Map<String, String> datas = plan.asMap(String.class, String.class);
		driver.findElement(By.xpath("//input[@id='rental1']")).sendKeys(datas.get("Rent"));
		driver.findElement(By.id("local_minutes")).sendKeys(datas.get("Mins"));
		driver.findElement(By.id("inter_minutes")).sendKeys(datas.get("Inter"));
		driver.findElement(By.id("sms_pack")).sendKeys(datas.get("SMS"));
		driver.findElement(By.id("minutes_charges")).sendKeys(datas.get("Local"));
		driver.findElement(By.id("inter_charges")).sendKeys(datas.get("National"));
		driver.findElement(By.id("sms_charges")).sendKeys(datas.get("Charge"));

	}

	@When("User choosed tariff planss")
	public void user_choosed_tariff_planss(io.cucumber.datatable.DataTable twoList) {
		List<List<String>> datas = twoList.asLists(String.class);
		driver.findElement(By.xpath("//input[@id='rental1']")).sendKeys(datas.get(1).get(0));
		driver.findElement(By.id("local_minutes")).sendKeys(datas.get(1).get(1));
		driver.findElement(By.id("inter_minutes")).sendKeys(datas.get(1).get(2));
		driver.findElement(By.id("sms_pack")).sendKeys(datas.get(1).get(3));
		driver.findElement(By.id("minutes_charges")).sendKeys(datas.get(1).get(4));
		driver.findElement(By.id("inter_charges")).sendKeys(datas.get(1).get(5));
		driver.findElement(By.id("sms_charges")).sendKeys(datas.get(1).get(6));

	}

	@When("User chooses his tariff plans")
	public void user_chooses_his_tariff_plans(io.cucumber.datatable.DataTable twoMap) {
		List<Map<String,String>> datas=twoMap.asMaps(String.class,String.class);
		driver.findElement(By.xpath("//input[@id='rental1']")).sendKeys(datas.get(1).get("Rental"));
		driver.findElement(By.id("local_minutes")).sendKeys(datas.get(1).get("Local"));
		driver.findElement(By.id("inter_minutes")).sendKeys(datas.get(1).get("Inter"));
		driver.findElement(By.id("sms_pack")).sendKeys(datas.get(1).get("SMS"));
		driver.findElement(By.id("minutes_charges")).sendKeys(datas.get(1).get("LocChar"));
		driver.findElement(By.id("inter_charges")).sendKeys(datas.get(1).get("InterChar"));
		driver.findElement(By.id("sms_charges")).sendKeys(datas.get(1).get("SMSChar"));

		
		
		
		
		
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
