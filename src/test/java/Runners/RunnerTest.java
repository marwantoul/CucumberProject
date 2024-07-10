package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features ="src/test/resources/features", // path de package ou se trouve tous les features

        glue = {"hooks", "steps"}  // path de package ou se trouve tous les steps & hooks


)
public class RunnerTest extends AbstractTestNGCucumberTests {

}
