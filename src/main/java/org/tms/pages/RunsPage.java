package org.tms.pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


@Log4j2
public class RunsPage extends BasePage{

    @FindBy(xpath = "//a[contains(text(), 'AQA17-onl')]")
    private WebElement linkCreatedProject;

    @FindBy(xpath = "//span[contains(text(), 'Test Runs')]")
    private WebElement linkRunsTest;

    @FindBy(xpath = "//a[@id = 'start-new-test-run-button']")
    private WebElement createTestRunButton;

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

    @Step("Open project")
    public RunsPage openProject(){
        log.info("Open project");
        wait.until(ExpectedConditions.visibilityOf(linkCreatedProject));
        linkCreatedProject.click();
        return this;
    }

    @Step("Click to tests runs link")
    public RunsPage clickTestsRunLink(){
        log.info("Click to tests runs link");
        wait.until(ExpectedConditions.visibilityOf(linkRunsTest));
        linkRunsTest.click();
        return this;
    }

    @Step("Click to create run button")
    public RunsPage clickCreateRunButton(){
        log.info("Click to create run button");
        wait.until(ExpectedConditions.visibilityOf(createTestRunButton));
        createTestRunButton.click();
        return this;
    }

    @Step("Click save run button")
    public RunsPage clickSaveRunButton(){
        log.info("Click save run button");
        wait.until(ExpectedConditions.visibilityOf(saveRunButton));
        saveRunButton.click();
        return this;
    }

    @Step("Get name created run")
    public String getNameCreatedRun(){
        log.info("Get name created run");
        wait.until(ExpectedConditions.visibilityOf(createdRun));
        return createdRun.getText();
    }

    @Step("Get text error of run creation")
    public String getTextErrorRunCreation(){
        log.info("Get text error of run creation");
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
