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

public class AddCustomerDetails {
	static WebDriver driver;
	@Given("user should be in homepage.")
	public void user_should_be_in_homepage() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SureshG\\subhaworkspace\\CumDemo\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom");
	   
	}

	@Given("user should click on Add customer.")
	public void user_should_click_on_Add_customer() {
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
		
	    
	}

	@When("user enters all the fields  valid datas.")
	public void user_enters_all_the_fields_valid_datas() {
		driver.findElement(By.xpath("//label[@for='done']")).click();
		WebElement frstname=driver.findElement(By.id("fname"));
		frstname.sendKeys("Tejen");
		WebElement  lstname=driver.findElement(By.id("lname"));
		lstname.sendKeys("Suresh");
		WebElement mail=driver.findElement(By.id("email"));
		mail.sendKeys("tejen18@gmail.com");
		WebElement add=driver.findElement(By.name("addr"));
		add.sendKeys("Chennai");
		WebElement phone=driver.findElement(By.id("telephoneno"));
		phone.sendKeys("4567345673");
		
	   
	}
	@When("user enters all the field valid datas.")
	public void user_enters_all_the_field_valid_datas(io.cucumber.datatable.DataTable cusDetails ) {
		List<String> datas=cusDetails.asList(String.class);
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys(datas.get(0));
		driver.findElement(By.id("lname")).sendKeys(datas.get(1));
		driver.findElement(By.id("email")).sendKeys(datas.get(2));
		driver.findElement(By.name("addr")).sendKeys(datas.get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(datas.get(4));
				
	}
	@When("user enters all the field with  valid datas.")
	public void user_enters_all_the_field_with_valid_datas(DataTable cusDetails) {
		Map<String,String> datas=cusDetails.asMap(String.class, String.class);
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys(datas.get("Fstname"));
		driver.findElement(By.id("lname")).sendKeys(datas.get("lstname"));
		driver.findElement(By.id("email")).sendKeys(datas.get("mail"));
		driver.findElement(By.name("addr")).sendKeys(datas.get("Add"));
		driver.findElement(By.id("telephoneno")).sendKeys(datas.get("phone"));
	}
	
	@When("user enters all the field validated datas.")
	public void user_enters_all_the_field_validated_datas(io.cucumber.datatable.DataTable twoList) {
		List<List<String>>datas=twoList.asLists(String.class);
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys(datas.get(0).get(0));
		driver.findElement(By.id("lname")).sendKeys(datas.get(1).get(1));
		driver.findElement(By.id("email")).sendKeys(datas.get(1).get(2));
		driver.findElement(By.name("addr")).sendKeys(datas.get(1).get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(datas.get(0).get(4));
		}
	
	@When("user enters all the field with validated datas.")
	public void user_enters_all_the_field_with_validated_datas(io.cucumber.datatable.DataTable twoMap) {
		List<Map<String,String>>datas=twoMap.asMaps(String.class,String.class);
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys(datas.get(1).get("Fstname"));
		driver.findElement(By.id("lname")).sendKeys(datas.get(1).get("lstname"));
		driver.findElement(By.id("email")).sendKeys(datas.get(0).get("Mail"));
		driver.findElement(By.name("addr")).sendKeys(datas.get(1).get("Add"));
		driver.findElement(By.id("telephoneno")).sendKeys(datas.get(0).get("Phone"));
	}
		
	
	@When("user clicks on submit button.")
	public void user_clicks_on_submit_button() {
		driver.findElement(By.xpath("//input[@type='submit']"));
	   }

	@Then("user should get Customer Id displayed.")
	public void user_should_get_Customer_Id_displayed() {
		WebElement msg=driver.findElement(By.xpath("(//td[@align='center'])[2]"));
	  // Assert.assertTrue(customerId.isDisplayed());
		String txt=msg.getText();
		System.out.println(txt);
	   
	}


	

}
