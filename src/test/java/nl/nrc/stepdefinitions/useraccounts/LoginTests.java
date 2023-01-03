package nl.nrc.stepdefinitions.useraccounts;
import io.cucumber.java.en.*;
import nl.nrc.pages.LoginScreen;
import nl.nrc.pages.WelcomeScreen;

public class LoginTests {
    // Initialize the WelcomeScreen and LoginScreen objects
    WelcomeScreen welcomeScreen = new WelcomeScreen();
    LoginScreen loginScreen = new LoginScreen();
    @Given("user sees login screen")
    public void userSeesLoginScreen() {
        // Make assertion of Login Button
        welcomeScreen.assertLoginButton();
        // Click the "Create Account" button
        welcomeScreen.clickLoginButton();
    }

    @When("user enters valid user id")
    public void userEntersValidUserId() {
    }

    @And("user enters valid password")
    public void userEntersValidPassword() {
    }

    @Then("user sees app discovery screen")
    public void userSeesAppDiscoveryScreen() {
    }

    @And("user enters invalid password")
    public void userEntersInvalidPassword() {
    }

    @Then("user sees error message")
    public void userSeesErrorMessage() {
    }
}
