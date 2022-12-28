package org.tms.pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Log4j2
public class LoginPage extends BasePage{

    @FindBy(xpath = "//input[@id='inputEmail']")
    private WebElement username;

    @FindBy(xpath = "//input[@id='inputPassword']")
    private WebElement password;

    @FindBy(xpath = "//button[@id='btnLogin']")
    private WebElement loginButton;

    WebDriverWait wait = new WebDriverWait(driver, 10);

    @Step("Open Login page")
    public LoginPage openPage(String url){
        log.info("Open Login page");
        driver.get(url);
        wait.until(ExpectedConditions.titleIs("Qase - test case management"));
        return this;
    }

    @Step("Fill user name")
    public LoginPage fillInUsername(String userName){
        log.info("Fill user name");
        username.clear();
        username.sendKeys(userName);
        return this;
    }

    @Step("Fill password")
    public LoginPage fillInPassword(String keyPassword){
        log.info("Fill password");
        password.clear();
        password.sendKeys(keyPassword);
        return this;
    }

    @Step("Click login button")
    public void clickLoginButton(){
        log.info("Click login button");
        loginButton.click();
    }
}
