package org.example;

import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.List;

public class RozetkaWishlistTest extends BaseTest{
    @Test
    public void testSearchAndAddToWishlist() throws InterruptedException {
        RozetkaSearchPage searchPage = new RozetkaSearchPage(driver, wait);
        searchPage.addMacBook2022ToWishlist();
        searchPage.addMacBook2020ToWishlist();
        searchPage.openWishlist();

    }
    @Test
    public void testWishlistInfo() throws InterruptedException {
        WishListPage wishListPage = new WishListPage(driver, wait);
        wishListPage.ShowWishList();
        List<ProductInfo> products = wishListPage.getWishListProducts();
        for (ProductInfo product : products) {
            System.out.println("Інформація про товари:");
            System.out.println("Назва: " + product.getName());
            System.out.println("Ціна: " + product.getPrice());
            System.out.println("Наявність: " + product.getAvailability());
        }
    }
}
