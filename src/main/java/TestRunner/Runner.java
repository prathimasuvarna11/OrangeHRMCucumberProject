package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\NI7587\\eclipse-workspace\\OrangeHRM\\src\\main\\java\\Features\\OrangeHRMLogin.feature",
		glue= {"stepDefinitions"}
		)

public class Runner {
	
	

}
