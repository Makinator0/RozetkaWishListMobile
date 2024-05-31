package org.example;

import org.testng.annotations.Test;



public class RozetkaLoginTest extends BaseTest {
    @Test
    public void testLogin() throws InterruptedException {
        MainPage mainPage = new MainPage(driver, wait);
        mainPage.navigateMainPage();
        mainPage.accountConfirmation();
    }
}
