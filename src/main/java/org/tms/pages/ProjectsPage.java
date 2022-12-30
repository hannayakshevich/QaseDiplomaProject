package org.tms.pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Log4j2
public class ProjectsPage extends BasePage{

    @FindBy(xpath = "//div[@class='container-fluid']/descendant::h1")
    private WebElement titleOfProjectsPage;

    @FindBy(xpath = "//button[@id='createButton']")
    private WebElement createProjectButton;

    @FindBy(xpath = "//input[@id='project-name']")
    private WebElement projectNameField;

    @FindBy(xpath = "//span[contains(text(),'Create project')]")
    private WebElement saveProjectButton;

    @FindBy(xpath = "//div[@class = 'add-filter-outer']")
    private WebElement addFilterButton;

    @FindBy(xpath = "//button[contains(text(), 'Member')]")
    private WebElement filterValue;

    @FindBy(xpath = "//span[contains(text(), 'Member')]")
    private WebElement addedFilterValue;

    @FindBy(xpath = "//div[contains(text(), '2 characters')]")
    private WebElement errorTextProjectCodeField;

    WebDriverWait wait = new WebDriverWait(driver, 10);

    @Step("Get Projects Page Name")
    public String getProjectNamePage(){
        log.info("Get Projects Page Name");
        return titleOfProjectsPage.getText();
    }

    @Step("Click to button Create Project")
    public ProjectsPage clickCreateProjectButton(){
        log.info("Click to button Create Project");
        createProjectButton.click();
        return this;
    }

    @Step("Fill field Project Name")
    public ProjectsPage fillProjectNameField(String projectName){
        log.info("Fill field Project Name");
        projectNameField.sendKeys(projectName);
        return this;
    }

    @Step("Click button Save Project")
    public ProjectsPage clickSaveProjectButton(){
        log.info("Click button Save Project");
        saveProjectButton.click();
        return this;
    }

    @Step("Click add filter button")
    public ProjectsPage clickAddFilterButton(){
        log.info("Click add filter button");
        addFilterButton.click();
        return this;
    }

    @Step("Choose filter value")
    public ProjectsPage chooseFilterValue(){
        log.info("Choose filter value");
        filterValue.click();
        return this;
    }

    @Step("Get Name Added Filter")
    public String getNameAddedFilter(){
        log.info("Get Name Added Filter");
        return addedFilterValue.getText();
    }

    @Step("Get Name Added Filter")
    public String getErrorTextProjectCodeField(){
        log.info("Get Name Added Filter");
        wait.until(ExpectedConditions.visibilityOf(errorTextProjectCodeField));
        return errorTextProjectCodeField.getText();
    }
}
