package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = ".//Features/", // run all feature files
//			features = ".//Features/Login.feature", // run specific feature file
//			features = {".//Features/Login.feature",".//Features/Customer.feature"}, // run multiple feature files
			glue = "stepDefinations",
//			dryRun = true,
			dryRun = false,
			monochrome = true,					
			plugin = {"pretty","html:testOutput","usage:target/cucumber-usage.json","json:target/cucmber.json",
					"junit:target/cucumber.xml","rerun:target/rerun.txt"},
			tags = {"@smoke"}
//			tags = {"@smoke, @regression"} // represents or
//			tags = {"@smoke","@regression"} // represents and
				)

public  class Test 
{

}
