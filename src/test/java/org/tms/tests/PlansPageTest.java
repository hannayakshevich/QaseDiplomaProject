package org.tms.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.tms.model.User;
import org.tms.services.LoginPageService;
import org.tms.services.PlansPageService;

public class PlansPageTest extends BaseTest{

    @Test
    public void successPlanCreationTest(){

        PlansPageService projectPageService = new PlansPageService();
        LoginPageService loginPageService = new LoginPageService();
        User user = new User();
        loginPageService.login(user);

        String actualTitleCreatedPlan = projectPageService.createNewPlan();
        String expectedTitleCreatedPlan = "newPlan";
        Assert.assertEquals(actualTitleCreatedPlan, expectedTitleCreatedPlan);
    }

    @Test
    public void errorPlanCreationTest(){

        PlansPageService projectPageService = new PlansPageService();
        LoginPageService loginPageService = new LoginPageService();
        User user = new User();
        loginPageService.login(user);

        String actualTextErrorPlanCreation = projectPageService.errorPlanCreation();
        String expectedTextErrorPlanCreation = "The cases field is required.";
        Assert.assertEquals(actualTextErrorPlanCreation, expectedTextErrorPlanCreation);
    }
}
