package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class CartScreen extends PageObject {
    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/noTV")
    private WebElement quantityTxt;

    public String getQuantityTxt() {
        return quantityTxt.getText();
    }
}
