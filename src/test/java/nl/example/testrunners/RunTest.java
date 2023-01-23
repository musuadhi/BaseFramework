package nl.example.testrunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ("src/test/resources/features/"),
        glue = ("src/test/java/nl/nrc/stepdefinitions/")
)
public class RunTest{
}
