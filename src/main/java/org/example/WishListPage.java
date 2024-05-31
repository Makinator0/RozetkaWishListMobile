package org.example;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class WishListPage {
    private AndroidDriver driver;
    private WebDriverWait wait;
    public WishListPage(AndroidDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }
    void ShowWishList() throws InterruptedException {
        Thread.sleep(9000);
        WebElement wishlistButton1 = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Список  (Основний) Кількість товарів: 2\"]"));
        wishlistButton1.click();
        Thread.sleep(9000);
    }
    public List<ProductInfo> getWishListProducts() throws InterruptedException {
        List<ProductInfo> products = new ArrayList<>();
        List<WebElement> wishlistItems = driver.findElements(By.xpath("//android.webkit.WebView[@text='ROZETKA - Список бажань | Особистий кабінет']/android.view.View/android.view.View[2]/android.view.View/android.widget.ListView/android.view.View/android.view.View"));
        Thread.sleep(9000);
        for (WebElement item : wishlistItems) {
            String productName = item.findElement(By.xpath(".//android.widget.TextView[contains(@text, 'Apple')]")).getText();
            String productPrice = item.findElement(By.xpath(".//android.widget.TextView[contains(@text, '₴')]")).getText();
            String availability = item.findElement(By.xpath(".//android.widget.TextView[contains(@text, 'Готовий до відправлення')]")).getText();
            products.add(new ProductInfo(productName, productPrice, availability));
        }
        return products;
    }

}
