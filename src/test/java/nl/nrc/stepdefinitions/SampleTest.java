package nl.nrc.stepdefinitions;
import io.cucumber.java.en.*;

public class SampleTest {
    @Given("everything is installed")
    public void everything_is_installed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Everything is installed!");
    }
    @When("user runs the sample test")
    public void user_runs_the_sample_test() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User ran the sample test");
    }
    @Then("the sample test is executed")
    public void the_sample_test_is_executed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Step definition for sample test executed!");
    }


}
