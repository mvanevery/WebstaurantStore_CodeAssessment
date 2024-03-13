package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BrowserDriver;

public class CommonPage {
WebDriver driver;

//Page Locators
@FindBy(xpath = "//*[@data-testid='logo']")
public WebElement homepageLogo;

    public CommonPage(WebDriver driver) {
        this.driver = driver;
    }

// Base Page Methods

    public void openBrowser(String url) {
        driver.get("https://" + url);
    }



}
