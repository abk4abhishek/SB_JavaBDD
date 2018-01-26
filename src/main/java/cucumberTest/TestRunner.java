

package cucumberTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features"
		,format= "json:TestResult/result.json"
		,glue={"stepDefinition"}
		)

public class TestRunner {

}