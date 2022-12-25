package org.tms.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.tms.model.User;
import org.tms.services.LoginPageService;

public class LoginPageTest extends BaseTest{

    @Test
    public void SuccessLoginTest(){
        LoginPageService setLoginPageService = new LoginPageService();
        User user = new User();

        String actualTitleOfQasePage = setLoginPageService.login(user)
                .getProjectNamePage();
        String expectedTitleOfQasePage = "Projects";
        Assert.assertEquals(actualTitleOfQasePage, expectedTitleOfQasePage, "Success Login");
    }
}
