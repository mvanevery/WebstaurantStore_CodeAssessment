package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.ShoppingCartPage;
import utilities.BrowserDriver;

public class ShoppingCartPageSteps {

    private ShoppingCartPage shoppingCartPage = new ShoppingCartPage(BrowserDriver.getDriver());

    @Then("User validates item is in the cart")
    public void user_validates_item_is_in_the_cart(){
        shoppingCartPage.validateShoppingCartItem();
    }

    @Then("User removes item from the cart and verifies it is gone")
    public void user_removes_item_from_cart(){
        shoppingCartPage.emptyCart();
    }







}
