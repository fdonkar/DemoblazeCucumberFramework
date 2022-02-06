package com.demoblaze.step_definitions;

import com.demoblaze.pages.ProductPage;
import com.demoblaze.utilities.ConfigurationReader;
import com.demoblaze.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class PurchaseSteps {

    ProductPage productPage = new ProductPage();

    @Given("User is on the homepage")
    public void user_is_on_the_homepage() {
        Driver.get().get(ConfigurationReader.get("demoblaze.url"));
    }

    @When("User adds some {string} from {string}")
    public void user_adds_some_from(String product, String category) {
        productPage.navigateTo(product,category);
        productPage.addToCart();
        productPage.home.click();
    }

    @And("User navigates to cart and removes {string}")
    public void userNavigatesToCartAndRemoves(String product) {

        productPage.cart.click();
        productPage.deleteProduct(product);

    }

    @And("User clicks on place order")
    public void userClicksOnPlaceOrder() {
        productPage.cart.click();
        productPage.placeOrder.click();
    }
}
