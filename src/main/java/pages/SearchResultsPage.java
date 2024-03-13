package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.List;

public class SearchResultsPage {

    private WebDriver driver;

    //Page Locatprs
    private By itemDescription = By.xpath("//span[@data-testid='itemDescription']");
    private By addToCartBtn = By.xpath("//input[@data-testid='itemAddCart']");
    private By viewCartBtn = By.xpath("//*[@data-testid='cart-button']");



    //Page class Constructor
    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


    //Page Methods

    public void searchThruListandEnter(String text) {

        List<WebElement> searchResults = driver.findElements(By.xpath("//span[@data-testid='itemDescription' and contains(text(),'" + text + "')]"));

        WebElement lastSearchResult = searchResults.get(searchResults.size() - 1);
        lastSearchResult.click();
    }









}
