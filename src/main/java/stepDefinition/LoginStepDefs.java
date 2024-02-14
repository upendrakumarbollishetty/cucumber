package stepDefinition;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {

	private RemoteWebDriver driver;

	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver =new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\upend\\eclipse-workspace\\Practice Exercises\\Selenium - S2\\CucumberTest\\drivers\\windows\\chromedriver.exe");
		
		driver.get("http://demowebshop.tricentis.com/login");
	    throw new io.cucumber.java.PendingException();
	}

	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User should be logged in successfully")
	public void user_should_be_logged_in_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	    @After
	    public void close_browser() {
	        driver.quit();
	}
}
