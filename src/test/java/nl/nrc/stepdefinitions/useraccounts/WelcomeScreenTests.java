package nl.nrc.stepdefinitions.useraccounts;
import io.cucumber.java.en.*;
import nl.nrc.pages.WelcomeScreen;
public class WelcomeScreenTests {

    // Initialize the WelcomeScreen object
    WelcomeScreen welcomeScreen = new WelcomeScreen();
    @Given("the user is on the welcome screen")
    public void theUserIsOnTheWelcomeScreen() {
        // Validate the welcome screen based on the presence of create account button
        welcomeScreen.assertCreateAccountButton();
        // To Do: Try Visual Validation using appium/packages/images-plugin/
    }
    @When("the user taps on the create account button")
    public void theUserTapsOnTheCreateAccountButton() {
        // Click the "Create Account" button
        welcomeScreen.clickCreateAccountButton();
    }
    @Then("the user is taken to the create account screen")
    public void theUserIsTakenToTheCreateAccountScreen() {
        //write code to make an assertion based on 'Playlist' button or via visual validation
    }

    @When("the user taps on the login button")
    public void theUserTapsOnTheLoginButton() {

    }

    @Then("the user is taken to the login screen")
    public void theUserIsTakenToTheLoginScreen() {
    }

//    @Then("user sees the create account screen")
//    public void userSeesTheCreateAccountScreen() {
//    }
//
//    @Then("verify if the create account button is present")
//    public void verifyIfTheCreateAccountButtonIsPresent() {
//    }
//
//    @And("verify if the login button is present")
//    public void verifyIfTheLoginButtonIsPresent() {
//    }
//
//    @When("the user taps on the login button")
//    public void theUserTapsOnTheLoginButton() {
//    }
//
//    @Then("the user is taken to the login screen")
//    public void theUserIsTakenToTheLoginScreen() {
//    }
}
