package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import utilities.BrowserDriver;


public class HomePageSteps {

    private HomePage homePage = new HomePage(BrowserDriver.getDriver());

        @Then("Validate User is on the homepage")
    public void validate_user_is_on_the_homepage() {
            homePage.validateHomepage();
    }

    @When("User searches for {string}")
    public void user_searches_for_item(String text) {
            homePage.enterTextIntoSearchField(text);
    }
}
