package org.tms.pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Log4j2
public class PlansPage extends BasePage{

    @FindBy(xpath = "//a[contains(text(), 'AQA17-onl')]")
    private WebElement linkCreatedProject;

    @FindBy(xpath = "//span[contains(text(), 'Test Plans')]")
    private WebElement linkTestsPlan;

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
    private WebElement titleNewPlan;

    @FindBy(xpath = "//div[contains(text(), 'The cases field is required.')]")
    private WebElement errorTextPlanCreation;

    private String planTitle = "newPlan";

    @Step("Open project")
    public PlansPage openProject(){
        log.info("Open project");
        wait.until(ExpectedConditions.visibilityOf(linkCreatedProject));
        linkCreatedProject.click();
        return this;
    }

    @Step("Click to tests plan link")
    public PlansPage clickTestsPlanLink(){
        log.info("Click to tests plan link");
        wait.until(ExpectedConditions.visibilityOf(linkTestsPlan));
        linkTestsPlan.click();
        return this;
    }

    @Step("Click to create plan button")
    public PlansPage clickCreatePlanButton(){
        log.info("Click to create plan button");
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

    @Step("Click to add cases button")
    public PlansPage clickAddCasesButton(){
        log.info("Click to add cases button");
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

    @Step("Get title created plan")
    public String getTitleCreatedPlan(){
        log.info("Get title created plan");
        wait.until(ExpectedConditions.visibilityOf(titleNewPlan));
        return titleNewPlan.getText();
    }

    @Step("Get text error of plan creation")
    public String getTextErrorPlanCreation(){
        log.info("Get text error of plan creation");
        wait.until(ExpectedConditions.visibilityOf(errorTextPlanCreation));
        return errorTextPlanCreation.getText();
    }
}

