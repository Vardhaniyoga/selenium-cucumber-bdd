package com.demo.sauce.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = {"com/demo/sauce/stepDefinitions"},
plugin = {"pretty","html:target/Reports/cucumberreport.html"}
)


public class TestRunner {


}
