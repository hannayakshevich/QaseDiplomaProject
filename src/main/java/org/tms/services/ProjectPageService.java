package org.tms.services;

import org.tms.pages.CreatedProjectPage;
import org.tms.pages.ProjectsPage;

public class ProjectPageService{

    protected ProjectsPage projectPage = new ProjectsPage();

    public CreatedProjectPage createNewProject(){
        projectPage.clickCreateNewProjectButton()
                .fillProjectNameField()
                .clickCreateProjectButton();
        return new CreatedProjectPage();
    }

    public String  addFilter(){
        return projectPage.clickAddFilterButton()
                .chooseFilterValue()
                .getNameAddedFilter();
    }

}
