package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class OrangeHRMLoginsteps {
	
	WebDriver driver;
	@Given("^user launches chome browser$")
	public void user_launches_chrome_browser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NI7587\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@When("^user opens OrangeHRM Login page$")
	public void user_opens_OrangeHRM_Login_page()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	
	  @Then("^user verifies that the logo is present on the Login Page$") public
	  void user_verifies_logo_present_on_Login_Page() 
	  {
		 boolean status= driver.findElement(By.xpath("//img[contains(@src,'logo')]")).isDisplayed();
		 Assert.assertEquals(true, status);
	  
	  }
	  
	  @Then("^close the browser$") public void close_the_browser()
	  {
		  driver.close();
	  
	  }
	 
}
