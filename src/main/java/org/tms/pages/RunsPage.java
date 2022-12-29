package org.tms.pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@Log4j2
public class RunsPage extends BasePage{
    @FindBy(xpath = "//a[contains(text(), 'AQA17-onl')]")
    private WebElement openProject;

    @FindBy(xpath = "//span[contains(text(), 'Test Runs')]")
    private WebElement runsPlanButton;

    @FindBy(xpath = "//a[@id = 'start-new-test-run-button']")
    private WebElement createRunPlanButton;

    @FindBy(xpath = "//div[@id = 'application-content']")
    private WebElement scrollElement;

    @FindBy(xpath = "//button[@id = 'edit-run-add-cases-button']")
    private WebElement addRunCasesButton;

    @FindBy(xpath = "//span[@class = 'custom-control-indicator']")
    private WebElement chooseRunCaseCheckBox;

    @FindBy(xpath = "//span[contains(text(), 'Done')]")
    private WebElement doneRunButton;

    @FindBy(xpath = "//button[@id = 'save-run-button']")
    private WebElement saveRunButton;

    @FindBy(xpath = "//a[contains(text(), 'Test run 2022/12/29')]")
    private WebElement createdRun;

    @FindBy(xpath = "//div[contains(text(), 'The cases field is required when " +
            "include all cases is not present.')]")
    private WebElement errorTextRunCreation;

    @FindBy(xpath = "//a[contains(text(), 'run-aqa17')]")
    private WebElement linkCreatedRun;

    @FindBy(xpath = "//button[@id = 'share-report-button']")
    private WebElement sharedReportButton;

    @FindBy(xpath = "//h3[@class = 'W_JRzn']")
    private WebElement titleSharedReportWindow;

    WebDriverWait wait = new WebDriverWait(driver, 10);

    @Step("Open project")
    public RunsPage openProject(){
        log.info("Open project");
        wait.until(ExpectedConditions.visibilityOf(openProject));
        openProject.click();
        return this;
    }

    @Step("Click to button tests runs button")
    public RunsPage clickTestsRunButton(){
        log.info("Click to button tests runs button");
        wait.until(ExpectedConditions.visibilityOf(runsPlanButton));
        runsPlanButton.click();
        return this;
    }

    @Step("Click to button create run button")
    public RunsPage clickCreateRunButton(){
        log.info("Click to button create run button");
        wait.until(ExpectedConditions.visibilityOf(createRunPlanButton));
        createRunPlanButton.click();
        return this;
    }

    @Step("Click to button add cases button")
    public RunsPage clickAddRunCasesButton(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js . executeScript ( "window.scrollBy(0,document.body.scrollHeight)" );
        log.info("Click to button add cases button");
        wait.until(ExpectedConditions.visibilityOf(addRunCasesButton));
        addRunCasesButton.click();
        return this;
    }

    @Step("Choose case checkbox")
    public RunsPage clickCasesRunCheckBox(){
        log.info("Choose case checkbox");
        wait.until(ExpectedConditions.visibilityOf(chooseRunCaseCheckBox));
        chooseRunCaseCheckBox.click();
        return this;
    }

    @Step("Click button Done")
    public RunsPage clickDoneRunButton(){
        log.info("Click button Done");
        wait.until(ExpectedConditions.visibilityOf(doneRunButton));
        doneRunButton.click();
        return this;
    }

    @Step("Click save run button")
    public RunsPage clickSaveRunButton(){
        log.info("Click save run button");
        wait.until(ExpectedConditions.visibilityOf(saveRunButton));
        saveRunButton.click();
        return this;
    }

    @Step("Verify created run")
    public String  verifyCreatedRun(){
        log.info("Verify created run");
        wait.until(ExpectedConditions.visibilityOf(createdRun));
        return createdRun.getText();
    }

    @Step("Verify text error of run creation")
    public String  verifyTextErrorRunCreation(){
        log.info("Verify text error of run creation");
        wait.until(ExpectedConditions.visibilityOf(errorTextRunCreation));
        return errorTextRunCreation.getText();
    }

    @Step("Open created run")
    public RunsPage openCreatedRun(){
        log.info("Open created run");
        wait.until(ExpectedConditions.visibilityOf(linkCreatedRun));
        linkCreatedRun.click();
        return this;
    }

    @Step("Click shared report button")
    public RunsPage clickSharedReportButton(){
        log.info("Click shared report button");
        wait.until(ExpectedConditions.visibilityOf(sharedReportButton));
        sharedReportButton.click();
        return this;
    }

    @Step("Get title shared report window")
    public String getSharedReportTitle(){
        log.info("Click shared report button");
        wait.until(ExpectedConditions.visibilityOf(titleSharedReportWindow));
        return titleSharedReportWindow.getText();
    }
}
