package stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import pages.CommonPage;
import utilities.BrowserDriver;


public class CommonPageSteps {

    private CommonPage commonPage = new CommonPage(BrowserDriver.getDriver());

    @Given("User navigates to {string}")
    public void user_navigates_to_the_webstaurant_store(String url) {
        commonPage.openBrowser(url);
    }



}

