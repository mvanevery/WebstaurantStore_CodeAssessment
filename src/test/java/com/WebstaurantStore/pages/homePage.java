package com.WebstaurantStore.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class homePage {

    //Page Locators
    @FindBy(xpath = "//*[@data-testid='logo'][1]")
    public WebElement homepageLogo;

    @FindBy(id = "searchval")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@value = 'Search']")
    public WebElement searchBoxButton;


// Page Methods

    public void validateHomepage() {
        driver.findElement(By.xpath("//*[@data-testid='logo'][1]")).isDisplayed();
    }

    public void enterTextIntoSearchField(String text) {
        if (searchBox.isEnabled()) {
            searchBox.sendKeys(text);
            searchBoxButton.click();
        }
    }
}


