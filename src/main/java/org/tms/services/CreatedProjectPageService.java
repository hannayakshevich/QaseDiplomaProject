package org.tms.services;

import org.tms.pages.CreatedProjectPage;

public class CreatedProjectPageService {

    protected CreatedProjectPage createdProjectPage = new CreatedProjectPage();

    public String  createNewSuite(){
        return createdProjectPage.openProject()
                .clickSuiteButton()
                .fillSuiteName()
                .clickCreateSuiteButton()
                .findCreatedSuite();
    }

    public String createNewCase(){
        return createdProjectPage.openProject()
                .clickCaseButton()
                .fillTitleCaseField()
                .saveNewCase()
                .findCreatedCase();
    }
}
