package org.example;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class WishListPage {
    private AndroidDriver driver;
    private WebDriverWait wait;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Список  (Основний) Кількість товарів: 2\"]")
    private WebElement wishlistButton;
    @AndroidFindBy(xpath = "//android.webkit.WebView[@text='ROZETKA - Список бажань | Особистий кабінет']/android.view.View/android.view.View[2]/android.view.View/android.widget.ListView/android.view.View/android.view.View")
    private List<WebElement> wishlistItems;
    public WishListPage(AndroidDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }
    public void showWishList() throws InterruptedException {
        Thread.sleep(9000);
        wishlistButton.click();
        Thread.sleep(9000);
    }
    public List<ProductInfo> getWishListProducts() throws InterruptedException {
        List<ProductInfo> products = new ArrayList<>();
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
