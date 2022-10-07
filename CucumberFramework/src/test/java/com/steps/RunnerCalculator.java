package com.steps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src/test/resources/salesforcelogin.feature"},
		glue= {"com.steps"}
		)
public class RunnerCalculator extends AbstractTestNGCucumberTests {

}
