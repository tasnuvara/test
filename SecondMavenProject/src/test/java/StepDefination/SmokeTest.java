package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.cucumber.java.en.*;

public class SmokeTest {

	
	WebDriver driver;
	
	@Given("open Internet Explorer and start application")
	public void open_internet_explorer_and_start_application() {
		
		driver= new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}   

	@Then("User should able to login out")
	public void user_should_able_to_login_out() {
	    driver.quit();
	}
}
