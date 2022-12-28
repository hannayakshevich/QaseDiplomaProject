package org.tms.pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Log4j2
public class CreatedProjectPage extends BasePage{

    @FindBy(xpath = "//div[contains(text(),'Project Name')]")
    private WebElement titleCreatedProjectPage;

    WebDriverWait wait = new WebDriverWait(driver, 10);

    @Step("Get Created Project Page Name")
    public String getCreatedProjectNamePage(){
        wait.until(ExpectedConditions.titleIs("PN | Repository | Qase"));
        log.info("Get Created Project Page Name");
        return titleCreatedProjectPage.getText();
    }
}
