package cuTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features"
		,format = {"pretty", "html:target/testResults"}
		,glue={"stepDefinition"}
		)

public class TestRunner {

}