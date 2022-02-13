package com.demoblaze.step_definitions;

import com.demoblaze.pages.ProductPage;
import com.demoblaze.utilities.BrowserUtils;
import com.demoblaze.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DataTableSteps {

    ProductPage productPage = new ProductPage();

    @Then("Under {string} category user should be able to see the list of following products")
    public void under_category_user_should_be_able_to_see_the_list_of_following_products(String category, List<String> expectedProducts) {

        BrowserUtils.sleep(2);
        Driver.get().findElement(By.linkText(category)).click();
        List<String> actualProducts = BrowserUtils.getElementsText(productPage.products);
        System.out.println("expectedProducts = " + expectedProducts);
        System.out.println("actualProducts = " + actualProducts);
        Assert.assertEquals("List of products are NOT as expected",expectedProducts,actualProducts);
    }
}
