package org.tms.pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import okio.Timeout;
import org.aspectj.apache.bcel.ExceptionConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

@Log4j2
public class ProjectsPage extends BasePage{

    @FindBy(xpath = "//div[@class='container-fluid']/descendant::h1")
    private WebElement titleOfProjectsPage;

    @FindBy(xpath = "//button[@id='createButton']")
    private WebElement createNewProjectButton;

    @FindBy(xpath = "//input[@id='project-name']")
    private WebElement projectNameField;

    @FindBy(xpath = "//span[contains(text(),'Create project')]")
    private WebElement createProjectButton;


    protected String projectName = "Project Name";

    @Step("Get Projects Page Name")
    public String getProjectNamePage(){
        log.info("Get Projects Page Name");
        return titleOfProjectsPage.getText();
    }

    @Step("Click to button Create New Project")
    public ProjectsPage clickCreateNewProjectButton(){
        log.info("Click to button Create New Project");
        createNewProjectButton.click();
        return this;
    }

    @Step("Fill field Project Name")
    public ProjectsPage fillProjectNameField(){
        log.info("Fill field Project Name");
        projectNameField.sendKeys(projectName);
        return this;
    }

    @Step("Click button Create Project")
    public void clickCreateProjectButton(){
        log.info("Click button Create Project");
        createProjectButton.click();
    }
}
