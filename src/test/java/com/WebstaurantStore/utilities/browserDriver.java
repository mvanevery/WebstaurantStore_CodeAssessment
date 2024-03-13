package com.WebstaurantStore.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserDriver {
    public WebDriver driver;
    public browserDriver(){
       String browserType;
       browserType = configReader.getProperty("browser");

       if(browserType == "chrome") {
           WebDriverManager.chromedriver().setup();
           driver = new ChromeDriver();
       }
    }

    public void close() {
        this.driver.close();
    }

//    public static ThreadLocal<WebDriver> driverGroup = new ThreadLocal<>();
//
//    public static WebDriver getDriver() {
//        if(driverGroup.get() == null) {
//            String browserType;
//            browserType = configReader.getProperty("browser");
//
//            switch(browserType) {
//
//                case "chrome":
//                    WebDriverManager.chromedriver().setup();
//                    driverGroup.set(new ChromeDriver());
////                    driverGroup.get().manage().window().maximize();
//            }
//        }
//        return driverGroup.get();
//
//    }

//    public void closeDriver() {
//        if(driverGroup.get() != null) {
//            driverGroup.get().quit();
//            driverGroup.remove();
//        }
//    }

}
