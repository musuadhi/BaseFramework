package nl.nrc.utils;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
public class DriverSetup {
    public static AndroidDriver<AndroidElement> driver;
    public static AndroidDriver<AndroidElement> getDriver() {
        //System.out.println("***** Inside getDriver*****");
        if (driver == null) {
            createDriver();
        }
        return driver;
    }
    private static void createDriver() {
        System.out.println("***** Connecting Device *****");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        // Set the desired device capabilities
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:deviceName", "Android"); //udid
        //capabilities.setCapability("appium:appPackage", "com.android.settings");
        //capabilities.setCapability("appium:appActivity", ".Settings");
        capabilities.setCapability("appium:appPackage", "nl.nrc.audio");
        capabilities.setCapability("appium:appActivity", "nl.pinch.nrcaudio.ui.splash.SplashActivity");
        //capabilities.setCapability("appium:appActivity", "nl.pinch.nrcaudio.ui.main.MainActivity");
        // Set the desired appium server capabilities
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("newCommandTimeout", 60);

        // Initialize the AndroidDriver object
        try {
            driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

}
