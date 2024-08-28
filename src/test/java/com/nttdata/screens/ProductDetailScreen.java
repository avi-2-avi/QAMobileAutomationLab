package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class ProductDetailScreen extends PageObject {
    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/plusIV")
    private WebElement addButton;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/cartBt")
    private WebElement cartAddButton;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/cartIV")
    private WebElement cartViewButton;

    public void addOneProduct() {
        addButton.click();
    }

    public void addToCart() {
        cartAddButton.click();
    }

    public void navigateToCart() {
        cartViewButton.click();
    }
}
