package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/",
        glue = {"StepsDefinitions"},
        tags = "@datadriven"// not, or, and
        )
public class Run extends AbstractTestNGCucumberTests {
}
