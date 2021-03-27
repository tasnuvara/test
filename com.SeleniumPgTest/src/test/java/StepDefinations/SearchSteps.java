package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {

	
	
	@Given("open browser and start application")
	public void open_browser_and_start_application()  {
	    System.out.println("Test1");}
	    

	@When("input data")
	public void input_data() {
				System.out.println("Test2");
	}

	@Then("navigate to that page")
	public void navigate_to_that_page() {
		System.out.println("Test3");
		
	}

}
