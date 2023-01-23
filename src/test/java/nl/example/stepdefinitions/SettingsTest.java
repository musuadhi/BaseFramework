package nl.example.stepdefinitions;
import io.cucumber.java.en.*;
import nl.example.pages.SettingsScreen;

public class SettingsTest {
    SettingsScreen settingsScreen = new SettingsScreen();
    @Given("user is on mobile home")
    public void userMobileHome() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Inside Given user is on mobile home");
    }
    @When("taps on the battery settings")
    public void openSettingsAndTapOnBattery() {
        System.out.println("Tapping on battery");
        settingsScreen.clickSettingsBattery();
    }

    @Then("battery information is seen")
    public void assertBatteryScreen() {
        System.out.println("Verify the battery screen");
    }
}
