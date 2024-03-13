package appHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.BrowserDriver;
import org.openqa.selenium.WebDriver;
import utilities.ConfigReader;

import java.util.Properties;


public class ApplicationHooks {

    private BrowserDriver browserDriver;
    private WebDriver driver;
    private ConfigReader configReader;
    Properties properties;


    @Before(order = 0)
    public  void getProperty() {
        configReader = new ConfigReader();
        properties = configReader.readPropertyFile();

    }

    @Before(order = 1)
    public void launchBroswer() {
    String browser = properties.getProperty("browser");
    browserDriver = new BrowserDriver();
    driver = browserDriver.startDrivers(browser);
    }

    @After(order = 0)
    public void quitBrowser() {
        driver.quit();
    }

    @After(order = 1)
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            //take screenshot
            String screenshotName = scenario.getName().replaceAll(" ", "_");
            byte [] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(sourcePath, "image/png", screenshotName);
        }
    }
}
