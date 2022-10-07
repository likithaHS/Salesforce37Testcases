package com.steps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.core.cli.Main;

@CucumberOptions(features= {"src/test/resources/salesforcelogin.feature"},
		glue= {"com.steps"}
		)
public class RunnerCalculator extends AbstractTestNGCucumberTests {

}
