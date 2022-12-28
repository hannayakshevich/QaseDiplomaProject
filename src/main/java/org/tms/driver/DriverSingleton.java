package org.tms.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

@Log4j2
@NoArgsConstructor
public class DriverSingleton {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (null == driver){
            switch (System.getProperty("browser")){
                case "firefox": {
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                }
                case "opera": {
                    WebDriverManager.operadriver().setup();
                    driver = new OperaDriver();
                    break;
                }
                default: {
                    try {
                        WebDriverManager.chromedriver().setup();
                        driver = new ChromeDriver();
                    }
                    catch (Exception e){
                        log.fatal("Driver did not start");
                    }
                }
            }
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void closeDriver(){
        driver.quit();
        driver = null;
    }
}
