package org.tms.tests.ui;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.tms.model.User;
import org.tms.services.LoginPageService;

public class LoginPageTest extends BaseTest{

    @Test
    public void LoginTest(){

        LoginPageService setLoginPageService = new LoginPageService();
        User user = new User();

        String actualTitleOfQasePage = setLoginPageService.login(user)
                .getProjectNamePage();
        String expectedTitleOfQasePage = "Projects";
        Assert.assertEquals(actualTitleOfQasePage, expectedTitleOfQasePage, "Login failed");
    }
}
