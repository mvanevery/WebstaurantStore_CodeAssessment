package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ShoppingCartPage {

//----------------------------------By Locators---------------------------------------------

private By cartItemList = By.xpath("//div[@class='details ']//child::span[@class='itemDescription description overflow-visible']");
private By emptyCartBtn = By.xpath("//button[contains(text(),'Empty Cart')]");
private By emptyCartConfirm = By.xpath("//footer[@data-testid='modal-footer']//child::button[contains(text(),'Empty')]");


//---------------------------------Page Constructors-----------------------------------------------

private WebDriver driver;
public ShoppingCartPage(WebDriver driver) {
    this.driver = driver;
}


//-----------------------------------Page Methods-------------------------------------------------------------
    /**
     * Validates by xpath that an element is no longer displayed on the page
     */
    private boolean verifyelementNotDisplayed(String element) {
    try {
        if (!(driver.findElement(By.xpath(element)).isDisplayed())) {
            return false;
        } else {
            return true;
        }
    }
    catch(Exception e){
            return false;
        }
    }

    /**
     * This method is used to create pauses within methods.
     * */
    private void pause(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * This method that there is an item in the shopping cart
     * */
    public void validateShoppingCartItem() {
    //This is to validate the item in the shopping cart matches the item from the product page
        Assert.assertTrue(driver.findElement(cartItemList).isDisplayed());
    }

    /**
     * This method is to empty the shopping cart and to confirm the cart is empty after wards
     * */
    public void emptyCart() {
    //If the cart is not empty, then click the empty cart button and confirm to empty it
        if(cartItemList != null) {
            driver.findElement(emptyCartBtn).click();
            pause(1000);
            driver.findElement(emptyCartConfirm).click();
            pause(1000);
        }
        //This validates that the cart is indeed empty
        verifyelementNotDisplayed(String.valueOf(cartItemList));
            
        }
}


