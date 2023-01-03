package org.tms.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.tms.driver.DriverSingleton;

public class BasePage {

    private static final int waitTime = 10;

    protected WebDriver driver = DriverSingleton.getDriver();

    WebDriverWait wait = new WebDriverWait(driver, waitTime);

    protected BasePage() {
        PageFactory.initElements(driver, this);
    }

}
