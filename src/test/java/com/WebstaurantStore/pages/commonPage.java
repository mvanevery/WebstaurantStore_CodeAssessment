package com.WebstaurantStore.pages;

import com.WebstaurantStore.utilities.browserDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class commonPage {
WebDriver driver;

//Page Locators
@FindBy(xpath = "//*[@data-testid='logo']")
public WebElement homepageLogo;

// Base Page Methods

    public void openBrowser(String url) {
        driver.get("https://" + url);
    }



}
