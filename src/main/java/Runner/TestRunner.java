package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\User\\eclipse-workspace\\"
		+ "FreecrmBDDFramework1\\src\\main\\java\\Feature\\Login.feature",//path of feature file 
glue = { "stepDefinations" },//path of step defination files
plugin = { "pretty",
		"html:CUCUMBER-HTML","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml" },
//to generate different types of reporting
monochrome=true,//display the console output in a proper readable format
strict=true,//it will check if any step is not defined in step defination file
dryRun=false//to check mapping is proper between feature file and step def file

		
		)
public class TestRunner {

}
