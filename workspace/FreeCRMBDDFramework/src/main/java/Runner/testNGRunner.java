package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = "C:\\Users\\pautp\\workspace\\FreeCRMBDDFramework\\src\\main\\java\\Features\\dealsMap.feature",
glue={"StepDefinition"},
format= {"pretty","html:test-outout", "json:json-output/cucumber.json","junit:junit-output/junit.xml"},
monochrome=true, // to display console o/p in readable format
strict=true, // to show Junit stacktarce red, when one step is not defined in stepdefintion file
dryRun=false) // to check mapping between feature file and step definition file
public class testNGRunner extends AbstractTestNGCucumberTests {
	
	
}
