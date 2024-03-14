package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchAndProductDetailsPage;
import utilities.BrowserDriver;

public class SearchAndProductDetailsPageSteps {
    private SearchAndProductDetailsPage searchAndProductDetailsPage = new SearchAndProductDetailsPage(BrowserDriver.getDriver());

    @When("User selects the last item from the {string} and goes to the product details page")
    public void user_selects_last_item_and_goes_to_details_page(String text) {
        searchAndProductDetailsPage.selectItemAndGoToDetailsFlow(text);
    }

    @Then("User adds product to the cart")
    public void user_add_product_to_the_cart() {
        searchAndProductDetailsPage.addItemToCart();
    }

    @When("User navigates to the cart")
    public void user_navigates_to_the_cart() {
        searchAndProductDetailsPage.goToShoppingCart();
    }


}
