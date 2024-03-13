package com.WebstaurantStore.stepDefinitions;

import com.WebstaurantStore.pages.commonPage;
import com.WebstaurantStore.pages.homePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class commonPage_stepDefs {

    WebDriver driver;

    @Given("User navigates to {string}")
    public void user_navigates_to_the_webstaurant_store(String url) {
        commonPage.openBrowser(url);
        System.out.println("This testrunner still works");
    }

//    @Then("Validate User is on the homepage")
//    public void validate_user_is_on_the_homepage() {
////        homePage.validateHomepage();
//        driver.findElement(By.xpath("//*[@data-testid='logo'][1]")).isDisplayed();
//    }

//    @When("User searches for {string}")
//    public void user_searches_for_item(String text) {
//        homePage.enterTextIntoSearchField(text);
//    }


}

