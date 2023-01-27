package nl.example.testrunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ("src/test/resources/features/system-settings/battery-settings.feature"),
        glue = ("src/test/java/nl/example/stepdefinitions/")
)
public class RunTest {
    public static void main(String[] args) {
        System.out.println("Features: " + System.getProperty("cucumber.options"));
    }
}