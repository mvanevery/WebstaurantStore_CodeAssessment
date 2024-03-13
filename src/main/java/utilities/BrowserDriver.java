package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserDriver {
    public WebDriver driver;

    public static ThreadLocal<WebDriver> driverGroup = new ThreadLocal<>();

    public WebDriver startDrivers(String browser){

       if(browser.equals("chrome")) {
           WebDriverManager.chromedriver().setup();
           driverGroup.set(new ChromeDriver());
       }
       else if (browser.equals("firefox")) {
           WebDriverManager.firefoxdriver().setup();
           driverGroup.set(new FirefoxDriver());
       }
       else if (browser.equals("ie") || browser.equals("internet explorer")) {
           WebDriverManager.edgedriver().setup();
           driverGroup.set(new EdgeDriver());
       }
       else if (browser.equals("safari")) {
           WebDriverManager.safaridriver().setup();
           driverGroup.set(new SafariDriver());
       }
       else {
           System.out.println("Please pass desired browser value: " + browser);
       }
       getDriver().manage().deleteAllCookies();
       getDriver().manage().window().maximize();
       return getDriver();
    }

    public static synchronized WebDriver getDriver() {
        return driverGroup.get();
    }


}
