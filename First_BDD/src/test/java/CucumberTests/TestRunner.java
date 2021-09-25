package CucumberTests;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "FeatureFile",glue= {"StepDefinition"})

public class TestRunner {

}
