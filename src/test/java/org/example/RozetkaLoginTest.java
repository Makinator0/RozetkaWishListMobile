package org.example;

import org.testng.annotations.Test;

import java.net.MalformedURLException;



public class RozetkaLoginTest extends BaseTest {
    @Test
    public void testLogin() throws InterruptedException, MalformedURLException {
        MainPage mainPage = new MainPage(driver, wait);
        mainPage.navigateMainPage();
        mainPage.Accountconfirmation();
    }
}
