package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFile",glue= {"stepDefination"},
									dryRun=false,
									monochrome=false,
											plugin = {"html:Report/orange1.html"}

									)
public class TestRunner {
}
