package org.example;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MainPage {
    private AndroidDriver driver;
    private WebDriverWait wait;
    @AndroidFindBy(id = "com.android.chrome:id/signin_fre_continue_button")
    private WebElement continueButton;

    @AndroidFindBy(id = "com.android.chrome:id/button_secondary")
    private WebElement skipButton;

    @AndroidFindBy(id = "com.android.chrome:id/more_button")
    private WebElement allowButton;

    @AndroidFindBy(id = "com.android.chrome:id/ack_button")
    private WebElement urlField;

    @AndroidFindBy(id = "com.android.chrome:id/search_box_text")
    private WebElement inputField;

    @AndroidFindBy(id = "com.android.chrome:id/url_bar")
    private WebElement urlBar;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id='com.android.chrome:id/sheet_item_list']/android.widget.LinearLayout[1]")
    private WebElement closeButton;

    public MainPage(AndroidDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);


    }
    public void navigateMainPage() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(continueButton)).click();
        Thread.sleep(7000);

        wait.until(ExpectedConditions.elementToBeClickable(skipButton)).click();
        Thread.sleep(7000);

        wait.until(ExpectedConditions.elementToBeClickable(allowButton)).click();
        Thread.sleep(7000);

        wait.until(ExpectedConditions.elementToBeClickable(urlField)).click();
        Thread.sleep(7000);

        wait.until(ExpectedConditions.elementToBeClickable(inputField)).click();

        wait.until(ExpectedConditions.elementToBeClickable(urlBar)).sendKeys("https://rozetka.com.ua/");
        Thread.sleep(3000);

        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        Thread.sleep(7000);
    }

    public void accountConfirmation() throws InterruptedException {
        Thread.sleep(9000);
        wait.until(ExpectedConditions.elementToBeClickable(closeButton)).click();
        Thread.sleep(7000);
    }

}

