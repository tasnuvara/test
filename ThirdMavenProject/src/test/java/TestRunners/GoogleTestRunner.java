package TestRunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"C:\\Users\\dasta\\eclipse-workspace\\ThirdMavenProject\\Feature\\Appfeature.feature"},
		glue= {"stepDefination"})
public class GoogleTestRunner {

}
