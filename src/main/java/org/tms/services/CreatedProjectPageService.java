package org.tms.services;

import org.tms.pages.CreatedProjectPage;

public class CreatedProjectPageService {

    private CreatedProjectPage createdProjectPage = new CreatedProjectPage();

    public String  createNewSuite(){
        return createdProjectPage.openProject()
                .clickCreateSuiteButton()
                .fillSuiteName()
                .clickSaveSuiteButton()
                .getTitleCreatedSuite();
    }

    public String createNewCase(){
        return createdProjectPage.openProject()
                .clickCreateCaseButton()
                .fillTitleCaseField()
                .saveCase()
                .getTitleCreatedCase();
    }
}
