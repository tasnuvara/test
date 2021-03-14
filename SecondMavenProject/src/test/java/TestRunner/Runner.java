package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Freature",
 glue= {"StepDefination"},
 plugin= {"html:target/cucumber-html-report"})


public class Runner {

	
	
	
	
	
}
