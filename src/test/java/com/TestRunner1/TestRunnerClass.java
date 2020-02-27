package com.TestRunner1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\welcome\\eclipse-workspace\\BigWECommerce\\src\\test\\resources\\FeaturePro\\BigW.Feature"},glue= {"StepDefinition1"},monochrome=true)

public class TestRunnerClass {
	
	}
