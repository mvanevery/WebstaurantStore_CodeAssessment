package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductDetailsPage {

//-------------------------------------------------By Locators---------------------------------------------------
    private By addToCartBtn = By.id("buyButton");






//----------------------------------------------Page Constructor--------------------------------------------
    private WebDriver driver;
    public  ProductDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    //----------------------------------------Page Methods--------------------------------------------------

    public void addItemToCart() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        if (driver.findElement(addToCartBtn).isDisplayed()) {
            driver.findElement(addToCartBtn).click();
        }
    }


    public void goToShoppingCart() {
        driver.findElement(By.xpath("//*[@data-testid='cart-button']")).click();
    }


}
