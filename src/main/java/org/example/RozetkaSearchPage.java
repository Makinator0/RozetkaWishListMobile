package org.example;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RozetkaSearchPage {
    private AndroidDriver driver;
    private WebDriverWait wait;
    public RozetkaSearchPage(AndroidDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }
    public void addMacBook2020ToWishlist() throws InterruptedException {
        Thread.sleep(9000);
        WebElement wishlistButton = driver.findElement(By.xpath("(//android.widget.Button[@text=\"Перемістити в список бажань\"])[1]"));
        wishlistButton.click();
        Thread.sleep(2000);
    }
    @Step("Find the specific MacBook product and add to wishlist")
    public void addMacBook2022ToWishlist() throws InterruptedException {
        Thread.sleep(7000);
        WebElement wishlistButton1 = driver.findElement(By.xpath("(//android.widget.Button[@text=\"Перемістити в список бажань\"])[2]"));
        wishlistButton1.click();
        Thread.sleep(200);
    }
    public void openWishlist() throws InterruptedException {
        Thread.sleep(7000);
        WebElement wishlistButton = driver.findElement(By.xpath("//android.widget.Button[@text=\"Відкрити меню\"]"));
        wishlistButton.click();
        WebElement wishlistButton1 = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Списки бажань 2\"]"));
        wishlistButton1.click();
        Thread.sleep(200);
    }
}
