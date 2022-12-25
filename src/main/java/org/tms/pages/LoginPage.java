package org.tms.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//input[@id='inputEmail']")
    private WebElement username;

    @FindBy(xpath = "//input[@id='inputPassword']")
    private WebElement password;

    @FindBy(xpath = "//button[@id='btnLogin']")
    private WebElement loginButton;

    WebDriverWait wait = new WebDriverWait(driver, 10);

    @Step("Open url page")
    public LoginPage openPage(String url){
        driver.get(url);
        wait.until(ExpectedConditions.titleIs("Qase - test case management"));
        return this;
    }

    @Step("Fill user name")
    public LoginPage fillInUsername(String userName){
        username.clear();
        username.sendKeys(userName);
        return this;
    }

    @Step("Fill password")
    public LoginPage fillInPassword(String keyPassword){
        password.clear();
        password.sendKeys(keyPassword);
        return this;
    }

    @Step("Click login button")
    public void clickLoginButton(){
        loginButton.click();
    }
}
