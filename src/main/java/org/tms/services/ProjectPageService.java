package org.tms.services;

import org.tms.pages.CreatedProjectPage;
import org.tms.pages.ProjectsPage;

public class ProjectPageService{

    private String projectNameSuccess = "Project Name";
    private String projectNameNegative = "P17";

    private ProjectsPage projectPage = new ProjectsPage();

    public CreatedProjectPage createNewProject(){

        projectPage.clickCreateProjectButton()
                .fillProjectNameField(projectNameSuccess)
                .clickSaveProjectButton();
        return new CreatedProjectPage();
    }

    public String  addFilter(){

        return projectPage.clickAddFilterButton()
                .chooseFilterValue()
                .getNameAddedFilter();
    }

    public String  verifyErrorProjectCodeField(){

        return projectPage.clickCreateProjectButton()
                .fillProjectNameField(projectNameNegative)
                .clickSaveProjectButton()
                .getErrorTextProjectCodeField();
    }

}
