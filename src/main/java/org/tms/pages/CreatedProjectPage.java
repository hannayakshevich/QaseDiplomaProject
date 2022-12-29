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
    private WebElement openProject;

    @FindBy(xpath = "//a[@id= 'create-suite-button']")
    private WebElement suiteButton;

    @FindBy(xpath = "//input[@id= 'name']")
    private WebElement fillSuiteName;

    @FindBy(xpath = "//button[@type = 'submit']/span[contains(text(), 'Create')]")
    private WebElement createSuiteButton;

    @FindBy(xpath = "//a[@title = 'newSuite']")
    private WebElement findCreatedSuite;

    @FindBy(xpath = "//a[@id = 'create-case-button']")
    private WebElement caseButton;

    @FindBy(xpath = "//input[@id = 'title']")
    private WebElement titleCaseField;

    @FindBy(xpath = "//button[@id = 'save-case']")
    private WebElement saveCaseButton;

    @FindBy(xpath = "//div[contains(text(), 'newCase')]")
    private WebElement createdCase;

    WebDriverWait wait = new WebDriverWait(driver, 10);

    protected String suiteName = "newSuite";
    protected String titleCaseName= "newCase";

    @Step("Get Created Project Page Name")
    public String getCreatedProjectNamePage(){
        wait.until(ExpectedConditions.titleIs("PN | Repository | Qase"));
        log.info("Get Created Project Page Name");
        return titleCreatedProjectPage.getText();
    }

    @Step("Open project")
    public CreatedProjectPage openProject(){
        log.info("Open project");
        wait.until(ExpectedConditions.visibilityOf(openProject));
        openProject.click();
        return this;
    }

    @Step("Click Suite button")
    public CreatedProjectPage clickSuiteButton(){
        log.info("Click Suite button");
        wait.until(ExpectedConditions.visibilityOf(suiteButton));
        suiteButton.click();
        return this;
    }

    @Step("Fill Suite name")
    public CreatedProjectPage fillSuiteName(){
        log.info("Fill Suite name");
        fillSuiteName.sendKeys(suiteName);
        return this;
    }

    @Step("Click Create Suite button")
    public CreatedProjectPage clickCreateSuiteButton(){
        log.info("Click Create Suite button");
        createSuiteButton.click();
        return this;
    }

    @Step("Find created suite")
    public String findCreatedSuite(){
        wait.until(ExpectedConditions.visibilityOf(findCreatedSuite));
        return findCreatedSuite.getText();
    }

    @Step("Click Case button")
    public CreatedProjectPage clickCaseButton(){
        log.info("Click Case button");
        wait.until(ExpectedConditions.visibilityOf(caseButton));
        caseButton.click();
        return this;
    }

    @Step("Fill Title Case Field")
    public CreatedProjectPage fillTitleCaseField(){
        log.info("Fill Title Case Field");
        wait.until(ExpectedConditions.visibilityOf(titleCaseField));
        titleCaseField.sendKeys(titleCaseName);
        return this;
    }

    @Step("Save New Case")
    public CreatedProjectPage saveNewCase(){
        log.info("Save New Case");
        wait.until(ExpectedConditions.visibilityOf(saveCaseButton));
        saveCaseButton.click();
        return this;
    }

    @Step("Find created suite")
    public String findCreatedCase(){
        wait.until(ExpectedConditions.visibilityOf(createdCase));
        return createdCase.getText();
    }

}
