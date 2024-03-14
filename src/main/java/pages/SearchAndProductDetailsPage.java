package pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.logging.Log;


import java.time.Duration;
import java.util.List;
import java.util.logging.Logger;


public class SearchAndProductDetailsPage {

    private WebDriver driver;

    //Page Locatprs

    private By addToCartBtn = By.id("buyButton");
    private By itemHeaderDescription = By.id("page-header-description");
    private By shoppingCartBtn = By.xpath("//*[@data-testid='cart-button']");
    private By shoppingCartQuantity = By.id("cartItemCountSpan");

    //Page class Constructor
    public SearchAndProductDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public SearchAndProductDetailsPage() {
    }


    //----------------------------------------------Page Methods------------------------------------------------------
    private void pause(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void selectItemAndGoToDetailsFlow(String text) {

        List<WebElement> searchResults = driver.findElements(By.xpath("//span[@data-testid='itemDescription' and contains(text(),'" + text + "')]"));
        WebElement lastSearchResult = searchResults.get(searchResults.size() - 1);

        String itemDetails = lastSearchResult.getText();
        lastSearchResult.click();
        pause(1000);
        var itemHeader = driver.findElement(itemHeaderDescription).getText();

        Assert.assertEquals(itemDetails, itemHeader);

    }


    public void addItemToCart() {
        if (driver.findElement(addToCartBtn).isDisplayed()) {
            driver.findElement(addToCartBtn).click();
            pause(1000);
        }
    }


    public void goToShoppingCart() {
        String cartTotal = driver.findElement(shoppingCartQuantity).getText();

        if (cartTotal != "0") {
            driver.findElement(shoppingCartBtn).click();
        } else {
            System.out.println("Nothing in cart. Add item first");
        }


    }








}
