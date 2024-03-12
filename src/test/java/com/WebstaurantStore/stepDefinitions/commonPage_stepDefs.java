package com.WebstaurantStore.stepDefinitions;

import com.WebstaurantStore.utilities.browserDriver;
import io.cucumber.java.en.Given;


public class commonPage_stepDefs {

    @Given("User navigates to the WebstaurantStore")
    public void user_navigates_to_the_webstaurant_store() {
        browserDriver.getDriver().get("https://www.webstaurantstore.com");
    }

}

