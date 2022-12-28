package org.tms.tests;

import lombok.extern.log4j.Log4j2;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.tms.model.User;
import org.tms.services.LoginPageService;

@Log4j2
public class LoginPageTest extends BaseTest{

    @Test
    public void SuccessLoginTest(){
        log.info("Run Success Login Test");

        LoginPageService setLoginPageService = new LoginPageService();
        User user = new User();

        String actualTitleOfQasePage = setLoginPageService.login(user)
                .getProjectNamePage();
        String expectedTitleOfQasePage = "Projects";
        Assert.assertEquals(actualTitleOfQasePage, expectedTitleOfQasePage, "Success Login");
    }
}
