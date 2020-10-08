package testRunner;
//This is my test runner class

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//Features//",
		glue="stepDefinitions",
		monochrome=true,
		tags= {"@Testing"},
		plugin= {"pretty","html:test-output"}
		//dryRun = true
		)
public class TestRunner {

}
