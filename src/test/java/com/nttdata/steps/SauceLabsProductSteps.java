package com.nttdata.steps;

import com.nttdata.screens.CartScreen;
import com.nttdata.screens.ProductDetailScreen;
import com.nttdata.screens.ProductScreen;
import org.junit.Assert;

public class SauceLabsProductSteps {
    ProductScreen productScreen;
    ProductDetailScreen detailScreen;
    CartScreen cartScreen;

    public void waitForGalery() {
        String title = productScreen.getTitle();
        Assert.assertNotNull("ProductScreen should not be null", title);
    }

    public void navigateToProduct(String arg1) {
        if(arg1.equals("Sauce Labs Backpack")) {
            productScreen.navigateBackpack();
        } else if(arg1.equals("Sauce Labs Bolt - T-Shirt")) {
            productScreen.navigateShirt();
        } else if(arg1.equals("Sauce Labs Fleece Jacket")) {
            productScreen.navigateJacket();
        }
    }

    public void addProductUnits(int arg0) {
        for(int i = 0; i < arg0 - 1; i++) {
            detailScreen.addOneProduct();
       }

        detailScreen.addToCart();
    }

    public void navigateToCart() {
        detailScreen.navigateToCart();
    }

    public void assertProductQuantity() {
        String quantityStr = cartScreen.getQuantityTxt();

        //int quantity = Integer.parseInt(cartScreen.getQuantityTxt());
        //Assert.assertTrue(quantity > 1);
        Assert.assertNotNull("QuantityStr should not be null", quantityStr);


    }
}
