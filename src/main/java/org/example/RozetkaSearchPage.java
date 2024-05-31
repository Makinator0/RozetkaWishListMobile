package org.example;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RozetkaSearchPage {
    private AndroidDriver driver;
    private WebDriverWait wait;

    @AndroidFindBy(xpath = "(//android.widget.Button[@text=\"Перемістити в список бажань\"])[1]")
    private WebElement wishlistButton2020;

    @AndroidFindBy(xpath = "(//android.widget.Button[@text=\"Перемістити в список бажань\"])[2]")
    private WebElement wishlistButton2022;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"Відкрити меню\"]")
    private WebElement openMenuButton;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Списки бажань 2\"]")
    private WebElement wishlistMenuButton;

    public RozetkaSearchPage(AndroidDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }

    public void addMacBook2020ToWishlist() throws InterruptedException {
        Thread.sleep(8000);
        wishlistButton2020.click();
        Thread.sleep(2000);
    }

    @Step("Find the specific MacBook product and add to wishlist")
    public void addMacBook2022ToWishlist() throws InterruptedException {
        Thread.sleep(7000);
        wishlistButton2022.click();
    }

    public void openWishlist() throws InterruptedException {
        Thread.sleep(7000);
        openMenuButton.click();
        Thread.sleep(2000);
        wishlistMenuButton.click();
    }
}
