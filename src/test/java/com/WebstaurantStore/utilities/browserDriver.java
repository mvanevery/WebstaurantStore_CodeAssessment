package com.WebstaurantStore.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserDriver {

    private browserDriver(){
    }

    private static ThreadLocal<WebDriver> driverGroup = new ThreadLocal<>();

    public static WebDriver getDriver() {
        if(driverGroup.get() == null) {
            String browserType = configReader.getProperty("browser");

            switch(browserType) {

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driverGroup.set(new ChromeDriver());
//                    driverGroup.get().manage().window().maximize();
            }
        }
        return driverGroup.get();

    }

    public static void closeDriver() {
        if(driverGroup.get() != null) {
            driverGroup.get().quit();
            driverGroup.remove();
        }
    }


//    public static WebDriver driver;
//
//    public ChromeOptions options;
//
//    public browserDriver() {
//        this.driver = driver;
//        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
//        this.driver = new ChromeDriver();
//    }
//
//    public void close() {
//        this.driver.close();
//    }
}
