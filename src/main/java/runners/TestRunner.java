package runners;

//@RunWith(stepDefinition.LoginStepDefs)
@CucumberOptions(
    features = "src/test/resources",
    glue = "stepDefinition",
    plugin = {"pretty", "html:target/cucumber-reports"}
)
public class TestRunner {
}



