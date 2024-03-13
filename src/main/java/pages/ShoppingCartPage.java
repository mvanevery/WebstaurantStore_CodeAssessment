package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage {

    private WebDriver driver;

        private By cartItemList = By.xpath("//li[@data-cart-item-id]");






    public ShoppingCartPage(WebDriver driver) {
        this.driver = driver;
    }



    public void validateShoppingCartItem() {
    if(cartItemList != null) {
     String details = driver.findElement(cartItemList).getAttribute("title");
     System.out.println(details);


    }
    }

}
