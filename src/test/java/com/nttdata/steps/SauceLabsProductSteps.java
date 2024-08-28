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
        Assert.assertNotNull("ProductScreen should not be null", productScreen.getTitle());
        // Assert.assertEquals("Products", productScreen.getTitle() );

        Assert.assertTrue(productScreen.getCountElements()>1);
    }

    public void navigateToProduct(String arg1) {
        if(arg1.equals("Sauce Labs Backpack")) {
            productScreen.navigateBackpack();
        } else if(arg1.equals("Sauce Labs Bolt - T-Shirt")) {
            productScreen.navigateShirt();
        } else if(arg1.equals("Sauce Labs Bike Light")) {
            productScreen.navigateBike();
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
        int quantity = Integer.parseInt(cartScreen.getQuantityTxt());
        Assert.assertTrue(quantity > 1);
    }
}
