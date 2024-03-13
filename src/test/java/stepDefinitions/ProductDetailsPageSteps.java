package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProductDetailsPage;
import utilities.BrowserDriver;

public class ProductDetailsPageSteps {

    private ProductDetailsPage productDetailsPage = new ProductDetailsPage(BrowserDriver.getDriver());

    @When("User navigates to the cart")
    public void user_navigates_to_the_cart() {
        productDetailsPage.goToShoppingCart();
    }
    @Then("User adds product to the cart")
    public void user_add_product_to_the_cart() {
        productDetailsPage.addItemToCart();
    }


}

