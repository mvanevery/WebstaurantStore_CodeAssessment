package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchResultsPage;
import utilities.BrowserDriver;

public class SearchResultsPageSteps {
    private SearchResultsPage searchResultsPage = new SearchResultsPage(BrowserDriver.getDriver());

    @Then("User searches through the results for {string} in the title and goes to the product page")
    public void user_search_results_list_for_item_then_goes_to_product_page(String text) {
        searchResultsPage.searchThruListandEnter(text);
    }




}
