package pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;



public class SearchAndProductDetailsPage {



    //------------------------------------------Page Locatprs--------------------------------------------------

    private By addToCartBtn = By.id("buyButton");
    private By itemHeaderDescription = By.id("page-header-description");
    private By shoppingCartBtn = By.xpath("//*[@data-testid='cart-button']");
    private By shoppingCartQuantity = By.id("cartItemCountSpan");

    //--------------------------------------------Page class Constructor-----------------------------------------
    public SearchAndProductDetailsPage(WebDriver driver) {
        this.driver = driver;
    }
    public static WebDriver driver;

    //----------------------------------------------Page Methods------------------------------------------------------
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
     * This method searches through the entire search results page and find the last item.
     * Then it grabs the product description from the search results,
     * Selects the product, moves to the product details page and compares
     * the product description from the search results against the product details header to validate
     * it is the same product.
     * */
    public void selectItemAndGoToDetailsFlow(String text) {

        List<WebElement> searchResults = driver.findElements(By.xpath("//span[@data-testid='itemDescription' and contains(text(),'" + text + "')]"));
        WebElement lastSearchResult = searchResults.get(searchResults.size() - 1);

        String itemDetails = lastSearchResult.getText();
        lastSearchResult.click();
        pause(1000);
        String itemHeader = driver.findElement(itemHeaderDescription).getText();

        Assert.assertEquals(itemDetails, itemHeader);
    }

    /**
     * This method simply clicks the Add to Cart button on the product details page
     * */
    public void addItemToCart() {
        if (driver.findElement(addToCartBtn).isDisplayed()) {
            driver.findElement(addToCartBtn).click();
            pause(1000);
        }
    }

    /**
     * This method simply clicks the shopping cart button to navigate to the cart
     * */
    public void goToShoppingCart() {
       if(driver.findElement(shoppingCartBtn).isDisplayed()) {
           driver.findElement(shoppingCartBtn).click();
       }
    }








}
