package nl.example.stepdefinitions.useraccounts;
import io.cucumber.java.en.*;
import nl.example.pages.LoginScreen;
import nl.example.pages.WelcomeScreen;
public class LoginTests {
    // Initialize the WelcomeScreen and LoginScreen objects
    WelcomeScreen welcomeScreen = new WelcomeScreen();
    LoginScreen loginScreen = new LoginScreen();
    @Given("the user is on login screen")
    public void userSeesLoginScreen() {
        // Validate Welcome screen by checking for login button
        welcomeScreen.assertLoginButton();
        // Click the "Login button" button
        welcomeScreen.clickLoginButton();
        // Validate Login screen by checking for email text box
        loginScreen.assertEmailField();
    }

    @When("the user enters valid user id as {string}")
    public void userEntersValidUserIdAs(String arg0) {
        loginScreen.enterUsername(arg0);
    }

    @And("the user enters valid password as {string}")
    public void userEntersValidPasswordAs(String arg0) {
        loginScreen.enterPassword(arg0);
    }

    @And("the user taps on the Inloggen button")
    public void theUserTapsOnTheLoginButton() {
        loginScreen.clickLoginButton();
    }
    @Then("the user sees app discovery screen")
    public void userSeesAppDiscoveryScreen() {
        // Write code to validate the App home screen
    }

    @And("the user enters invalid password")
    public void userEntersInvalidPassword() {
    }

    @Then("the user sees error message")
    public void userSeesErrorMessage() {
    }
}
