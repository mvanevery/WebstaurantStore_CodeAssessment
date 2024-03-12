package com.WebstaurantStore.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class commonPage {
    public static WebDriver driver;

// Base Page Methods

    public void openBrowser() {
//        if (browser == "Chrome") {
            WebDriverManager.chromedriver().create();
            driver.get("https://www.webstaurantstore.com/");
//        }
    }


}
