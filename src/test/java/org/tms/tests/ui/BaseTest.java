package org.tms.tests.ui;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import org.tms.driver.DriverSingleton;
import org.tms.utils.TestListener;

@Listeners(TestListener.class)
public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void startBrowser() {
        driver = DriverSingleton.getDriver();
    }

    @AfterMethod
    public  void stopBrowser(){
        DriverSingleton.closeDriver();
    }
}
