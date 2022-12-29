package org.tms.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.tms.model.User;
import org.tms.services.LoginPageService;
import org.tms.services.RunsPageService;

public class RunsPageTest extends BaseTest{


    @Test
    public void successRunCreationTest(){

        RunsPageService runsPageService = new RunsPageService();
        LoginPageService loginPageService = new LoginPageService();
        User user = new User();
        loginPageService.login(user);

        String actualTitleCreatedRun = runsPageService.createNewRun();
        String expectedTitleCreatedRun = "Test run 2022/12/29";
        Assert.assertEquals(actualTitleCreatedRun, expectedTitleCreatedRun);
    }

    @Test
    public void errorRunCreationTest(){

        RunsPageService runsPageService = new RunsPageService();
        LoginPageService loginPageService = new LoginPageService();
        User user = new User();
        loginPageService.login(user);

        String actualTextErrorRunCreation = runsPageService.errorRunCreation();
        String expectedTextErrorRunCreation = "The cases field is required when " +
                "include all cases is not present.";
        Assert.assertEquals(actualTextErrorRunCreation, expectedTextErrorRunCreation);
    }

    @Test
    public void verifySharedReportWindowTitleTest(){

        RunsPageService runsPageService = new RunsPageService();
        LoginPageService loginPageService = new LoginPageService();
        User user = new User();
        loginPageService.login(user);

        String actualTextErrorRunCreation = runsPageService.verifySharedReportWindowTitle();
        String expectedTextErrorRunCreation = "Share report";
        Assert.assertEquals(actualTextErrorRunCreation, expectedTextErrorRunCreation);
    }

}
