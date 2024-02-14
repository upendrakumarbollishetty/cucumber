package runners1;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

//@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src\\main\\java\\CucumberTest\\search.feature",
    glue = "stepDefinition",
    plugin = {"pretty", "html:target/cucumber-reports"}
)
public class SearchRunner {
    // No need to write any code here
}




