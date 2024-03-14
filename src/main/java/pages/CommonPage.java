package pages;



import org.openqa.selenium.WebDriver;

public class CommonPage {

//---------------------------------------By Locators--------------------------------------------


//------------------------------------Page Class Constructor-------------------------------------------
    private WebDriver driver;
    public CommonPage(WebDriver driver) {
        this.driver = driver;
    }

//------------------------------------Base Page Methods-----------------------------------------------
    /**
     * This simply launches the browser
     * */
    public void openBrowser(String url) {
        driver.get("https://" + url);
    }



}
