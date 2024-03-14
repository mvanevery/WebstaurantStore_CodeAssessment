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

    @Then("User removes item from the cart")
    public void user_removes_item_from_cart(){
        shoppingCartPage.emptyCart();
    }

    @Then("User validates item is no longer in the cart")
    public void user_validates_item_is_no_longer_in_the_cart(){

    }






}
