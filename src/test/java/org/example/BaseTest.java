package org.example;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
public class BaseTest {
    protected static AndroidDriver driver;
    static WebDriverWait wait;


    @BeforeSuite
    public void setUp() throws MalformedURLException {
        if (driver == null) {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", "POCOPHONE F1");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("automationName", "uiautomator2");
            capabilities.setCapability("platformVersion", "10");
            capabilities.setCapability("appPackage", "com.android.chrome");
            capabilities.setCapability("appActivity", "com.google.android.apps.chrome.Main");
            URL url = URI.create("http://127.0.0.1:4723/").toURL();
            driver = new AndroidDriver(url, capabilities);
            wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        }
    }
    @AfterSuite
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
