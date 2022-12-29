package org.tms.pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Log4j2
public class PlansPage extends BasePage{

    @FindBy(xpath = "//a[contains(text(), 'AQA17-onl')]")
    private WebElement openProject;

    @FindBy(xpath = "//span[contains(text(), 'Test Plans')]")
    private WebElement testsPlanButton;

    @FindBy(xpath = "//a[@id = 'createButton']")
    private WebElement createPlanButton;

    @FindBy(xpath = "//input[@id = 'title']")
    private WebElement titlePlanField;

    @FindBy(xpath = "//button[@id = 'edit-plan-add-cases-button']")
    private WebElement addCasesButton;

    @FindBy(xpath = "//span[@class = 'custom-control-indicator']")
    private WebElement chooseCaseCheckBox;

    @FindBy(xpath = "//span[contains(text(), 'Done')]")
    private WebElement doneButton;

    @FindBy(xpath = "//button[@id = 'save-plan']")
    private WebElement savePlanButton;

    @FindBy(xpath = "//a[contains(text(), 'newPlan')]")
    private WebElement createdPlan;

    @FindBy(xpath = "//div[contains(text(), 'The cases field is required.')]")
    private WebElement errorTextPlanCreation;

    protected String planTitle = "newPlan";

    WebDriverWait wait = new WebDriverWait(driver, 10);

    @Step("Open project")
    public PlansPage openProject(){
        log.info("Open project");
        wait.until(ExpectedConditions.visibilityOf(openProject));
        openProject.click();
        return this;
    }

    @Step("Click to button tests plan button")
    public PlansPage clickTestsPlanButton(){
        log.info("Click to button tests plan button");
        wait.until(ExpectedConditions.visibilityOf(testsPlanButton));
        testsPlanButton.click();
        return this;
    }

    @Step("Click to button create plan button")
    public PlansPage clickCreatePlanButton(){
        log.info("Click to button create plan button");
        wait.until(ExpectedConditions.visibilityOf(createPlanButton));
        createPlanButton.click();
        return this;
    }

    @Step("Fill title plan field")
    public PlansPage fillTitlePlanField(){
        log.info("Fill title plan field");
        wait.until(ExpectedConditions.visibilityOf(titlePlanField));
        titlePlanField.sendKeys(planTitle);
        return this;
    }

    @Step("Click to button add cases button")
    public PlansPage clickAddCasesButton(){
        log.info("Click to button add cases button");
        wait.until(ExpectedConditions.visibilityOf(addCasesButton));
        addCasesButton.click();
        return this;
    }

    @Step("Choose case checkbox")
    public PlansPage clickCasesCheckBox(){
        log.info("Choose case checkbox");
        wait.until(ExpectedConditions.visibilityOf(chooseCaseCheckBox));
        chooseCaseCheckBox.click();
        return this;
    }

    @Step("Click button Done")
    public PlansPage clickDoneButton(){
        log.info("Click button Done");
        wait.until(ExpectedConditions.visibilityOf(doneButton));
        doneButton.click();
        return this;
    }

    @Step("Click save plan button")
    public PlansPage clickSavePlanButton(){
        log.info("Click save plan button");
        wait.until(ExpectedConditions.visibilityOf(savePlanButton));
        savePlanButton.click();
        return this;
    }

    @Step("Verify created plan")
    public String  verifyCreatedPlan(){
        log.info("Verify created plan");
        wait.until(ExpectedConditions.visibilityOf(createdPlan));
        return createdPlan.getText();
    }

    @Step("Verify text error of plan creation")
    public String  verifyTextErrorPlanCreation(){
        log.info("Verify text error of plan creation");
        wait.until(ExpectedConditions.visibilityOf(errorTextPlanCreation));
        return errorTextPlanCreation.getText();
    }
}

