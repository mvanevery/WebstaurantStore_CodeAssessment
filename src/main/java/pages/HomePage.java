package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage {
    private WebDriver driver;

    //Page Locators
    private By homepageLogo = By.xpath("//*[@data-testid='logo'][1]");
    private By searchBox = By.id("searchval");
    private By searchBoxButton = By.xpath("//button[@value = 'Search']");

   //Page class Constructor
   public HomePage(WebDriver driver) {
       this.driver = driver;
   }


//    @FindBy(xpath = "//*[@data-testid='logo'][1]")
//    public WebElement homepageLogo;



// Page Methods

    public void validateHomepage() {
        driver.findElement(homepageLogo).isDisplayed();
    }

    public void enterTextIntoSearchField(String text) {
        if (driver.findElement(searchBox).isDisplayed()) {
            driver.findElement(searchBox).sendKeys(text);
            driver.findElement(searchBoxButton).click();
        }
    }
}


