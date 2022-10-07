package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src/test/resources/salesforcelogin.feature"},
		glue= {"com.steps"},
		dryRun = true
		)
public class RunnerCalculator extends AbstractTestNGCucumberTests {

}
