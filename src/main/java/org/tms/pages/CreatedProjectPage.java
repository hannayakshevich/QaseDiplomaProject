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

    @FindBy(xpath = "//a[contains(text(), 'AQA17-onl')]")
    private WebElement linkCreatedProject;

    @FindBy(xpath = "//a[@id= 'create-suite-button']")
    private WebElement createSuiteButton;

    @FindBy(xpath = "//input[@id= 'name']")
    private WebElement nameSuiteField;

    @FindBy(xpath = "//button[@type = 'submit']/span[contains(text(), 'Create')]")
    private WebElement saveSuiteButton;

    @FindBy(xpath = "//a[@title = 'newSuite']")
    private WebElement titleNewSuite;

    @FindBy(xpath = "//a[@id = 'create-case-button']")
    private WebElement createCaseButton;

    @FindBy(xpath = "//input[@id = 'title']")
    private WebElement titleCaseField;

    @FindBy(xpath = "//button[@id = 'save-case']")
    private WebElement saveCaseButton;

    @FindBy(xpath = "//div[contains(text(), 'newCase')]")
    private WebElement titleNewCase;

    WebDriverWait wait = new WebDriverWait(driver, 10);

    protected String suiteName = "newSuite";
    protected String caseName = "newCase";

    @Step("Get Created Project Page Name")
    public String getCreatedProjectNamePage(){
        log.info("Get Created Project Page Name");
        wait.until(ExpectedConditions.titleIs("PN | Repository | Qase"));
        return titleCreatedProjectPage.getText();
    }

    @Step("Open project")
    public CreatedProjectPage openProject(){
        log.info("Open project");
        wait.until(ExpectedConditions.visibilityOf(linkCreatedProject));
        linkCreatedProject.click();
        return this;
    }

    @Step("Click Suite button")
    public CreatedProjectPage clickCreateSuiteButton(){
        log.info("Click Suite button");
        wait.until(ExpectedConditions.visibilityOf(createSuiteButton));
        createSuiteButton.click();
        return this;
    }

    @Step("Fill Suite name")
    public CreatedProjectPage fillSuiteName(){
        log.info("Fill Suite name");
        nameSuiteField.sendKeys(suiteName);
        return this;
    }

    @Step("Click Save Suite button")
    public CreatedProjectPage clickSaveSuiteButton(){
        log.info("Click Save Suite button");
        saveSuiteButton.click();
        return this;
    }

    @Step("Get title created suite")
    public String getTitleCreatedSuite(){
        log.info("Get title created suite");
        wait.until(ExpectedConditions.visibilityOf(titleNewSuite));
        return titleNewSuite.getText();
    }

    @Step("Click create Case button")
    public CreatedProjectPage clickCreateCaseButton(){
        log.info("Click create Case button");
        wait.until(ExpectedConditions.visibilityOf(createCaseButton));
        createCaseButton.click();
        return this;
    }

    @Step("Fill Title Case Field")
    public CreatedProjectPage fillTitleCaseField(){
        log.info("Fill Title Case Field");
        wait.until(ExpectedConditions.visibilityOf(titleCaseField));
        titleCaseField.sendKeys(caseName);
        return this;
    }

    @Step("Save Case")
    public CreatedProjectPage saveCase(){
        log.info("Save Case");
        wait.until(ExpectedConditions.visibilityOf(saveCaseButton));
        saveCaseButton.click();
        return this;
    }

    @Step("Get title created suite")
    public String getTitleCreatedCase(){
        log.info("Get title created suite");
        wait.until(ExpectedConditions.visibilityOf(titleNewCase));
        return titleNewCase.getText();
    }

}
