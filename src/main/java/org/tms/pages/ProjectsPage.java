package org.tms.pages;

import io.qameta.allure.Step;
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

public class ProjectsPage extends BasePage{

    @FindBy(xpath = "//div[@class='container-fluid']/descendant::h1")
    private WebElement titleOfProjectsPage;

    @Step("Verify Name of Projects Page")
    public String getProjectNamePage(){
        return titleOfProjectsPage.getText();
    }
}
