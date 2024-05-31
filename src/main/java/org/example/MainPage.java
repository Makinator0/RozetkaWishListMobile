package org.example;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MainPage {
    private AndroidDriver driver;
    private WebDriverWait wait;

    public MainPage(AndroidDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    public void navigateMainPage() throws InterruptedException {
        WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.android.chrome:id/signin_fre_continue_button")));
        continueButton.click();
        Thread.sleep(7000);

        WebElement skipButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.android.chrome:id/button_secondary")));
        skipButton.click();
        Thread.sleep(7000);

        WebElement allowButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.android.chrome:id/more_button")));
        allowButton.click();
        Thread.sleep(7000);

        WebElement urlField = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.android.chrome:id/ack_button")));
        urlField.click();
        Thread.sleep(7000);

        WebElement inputField = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.android.chrome:id/search_box_text")));
        inputField.click();

        WebElement urlBar = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.android.chrome:id/url_bar")));
        urlBar.sendKeys("https://rozetka.com.ua/");
        Thread.sleep(7000);

        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        Thread.sleep(7000);
    }

    public void Accountconfirmation() throws InterruptedException {
        Thread.sleep(7000);
        WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.android.chrome:id/sheet_item_list\"]/android.widget.LinearLayout[1]")));
        closeButton.click();

        Thread.sleep(7000);
    }

}

