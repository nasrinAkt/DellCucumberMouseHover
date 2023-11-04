package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions (features = {"src/test/resources/ebayFeatures"},
plugin = {"json:target/cucumber.json"},
glue = "StepDefinition",tags = {"@tag"})
public class RunnerClass extends AbstractTestNGCucumberTests {

}
