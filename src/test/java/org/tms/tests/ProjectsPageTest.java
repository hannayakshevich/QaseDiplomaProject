package org.tms.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.tms.model.User;
import org.tms.services.LoginPageService;
import org.tms.services.ProjectPageService;

public class ProjectsPageTest extends BaseTest{

    @Test
    public void successCreationNewProjectTest(){

        ProjectPageService projectPageService = new ProjectPageService();
        LoginPageService loginPageService = new LoginPageService();
        User user = new User();

        loginPageService.login(user);
        String actualTitleCreatedProjectName = projectPageService.createNewProject()
                .getCreatedProjectNamePage();
        String expectedTitleCreatedProjectName = "Project Name";
        Assert.assertEquals(actualTitleCreatedProjectName, expectedTitleCreatedProjectName, "Project was created");
    }

    @Test
    public void addFilterTest(){

        ProjectPageService projectPageService = new ProjectPageService();
        LoginPageService loginPageService = new LoginPageService();
        User user = new User();

        loginPageService.login(user);
        String actualFilterName = projectPageService.addFilter();
        String expectedFilterName = "Member";
        Assert.assertEquals(actualFilterName, expectedFilterName, "Filter was added");
    }

}
