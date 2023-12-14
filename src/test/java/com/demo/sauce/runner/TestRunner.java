package com.demo.sauce.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = {"com/demo/sauce/stepDefinitions"},
        plugin = {"pretty", "html:target/Reports/cucumberreport.html"},
        monochrome = true,
        tags = "@smoketest"
)


public class TestRunner {


}
