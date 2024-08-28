package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;


public class ProductScreen extends PageObject {
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/productTV\"]")
    private WebElement productSectionTitle;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@content-desc=\"Displays all products of catalog\"]")
    private List<WebElement> productList;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Backpack\"]")
    private WebElement backpackImage;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Bolt T-Shirt\"]")
    private WebElement shirtImage;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Bike Light\"]")
    private WebElement bikeImage;

    public String getTitle() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 15);
        wait.until(ExpectedConditions.visibilityOf(productSectionTitle));

        return productSectionTitle.getText();
    }

    public int getCountElements(){
        return productList.size();
    }

    public void navigateBackpack() {
        backpackImage.click();
    }

    public void navigateShirt() {
        shirtImage.click();
    }

    public void navigateBike() {
        bikeImage.click();
    }
}
