package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage {

//----------------------------------By Locators---------------------------------------------

private By cartItemList = By.xpath("//span[@class='itemDescription description overflow-visible']");
private By emptyCartBtn = By.xpath("//button[contains(text(),'Empty Cart')]");



//---------------------------------Page Constructors-----------------------------------------------

private WebDriver driver;
public ShoppingCartPage(WebDriver driver) {
   this.driver = driver;
}


//-----------------------------------Page Methods-------------------------------------------------------------
    private void pause(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void validateShoppingCartItem() {
    if(cartItemList != null) {
     String details = driver.findElement(cartItemList).getText();
     System.out.println(details);
     pause(2000);

          }
    }

    public void emptyCart() {
        if(cartItemList != null) {
            driver.findElement(emptyCartBtn).click();
        }
    }

}
