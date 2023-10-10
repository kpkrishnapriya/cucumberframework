package stepDefinitions;

import org.openqa.selenium.WebDriver;


import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.TestConfigProperties;
import util.WebDriverManager;


public class StepDefinitions {
	WebDriver driver;


	@Before
	public void setup() {
		driver = WebDriverManager.getDriver();
		
		
	}

@Given("at saucedemo")
public void at_saucedemo() {
  driver.get(new TestConfigProperties().testReadConfigProperties("saucedemo.url"));
    
}
@When("user enter password {string}")
public void user_enter_password(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("enter username as {string}")
public void enter_username_as(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("redirect to user Home page")
public void redirect_to_user_home_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}



}
