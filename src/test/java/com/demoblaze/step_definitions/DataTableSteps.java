package com.demoblaze.step_definitions;

import com.demoblaze.pages.ProductPage;
import com.demoblaze.utilities.Driver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DataTableSteps {

    ProductPage productPage = new ProductPage();

    @Then("Under {string} category user should be able to see the list of following products")
    public void under_category_user_should_be_able_to_see_the_list_of_following_products(String category, List<String> expectedProducts) {

        Driver.get().findElement(By.linkText(category)).click();
        List<WebElement> productsElements = productPage.products;

    }
}
