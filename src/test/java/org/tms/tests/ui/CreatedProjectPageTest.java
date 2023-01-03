package org.tms.tests.ui;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.tms.model.User;
import org.tms.services.CreatedProjectPageService;
import org.tms.services.LoginPageService;

public class CreatedProjectPageTest extends BaseTest{

    @Test
    public void createNewSuite(){

        CreatedProjectPageService createdProjectService = new CreatedProjectPageService();
        LoginPageService loginPageService = new LoginPageService();
        User user = new User();

        loginPageService.login(user);
        String actual = createdProjectService.createNewSuite();
        Assert.assertEquals(actual, "newSuite");
    }

    @Test
    public void createNewCase(){

        CreatedProjectPageService createdProjectService = new CreatedProjectPageService();
        LoginPageService loginPageService = new LoginPageService();
        User user = new User();

        loginPageService.login(user);
        String actual = createdProjectService.createNewCase();
        Assert.assertEquals(actual, "newCase");
    }

}
