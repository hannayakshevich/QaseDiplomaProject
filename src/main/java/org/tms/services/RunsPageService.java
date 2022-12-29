package org.tms.services;

import org.tms.pages.RunsPage;

public class RunsPageService {

    protected RunsPage plansPage = new RunsPage();

    public String createNewRun(){
        return plansPage.openProject()
                .clickTestsRunButton()
                .clickCreateRunButton()
                .clickAddRunCasesButton()
                .clickCasesRunCheckBox()
                .clickDoneRunButton()
                .clickSaveRunButton()
                .verifyCreatedRun();
    }

    public String errorRunCreation(){
        return plansPage.openProject()
                .clickTestsRunButton()
                .clickCreateRunButton()
                .clickSaveRunButton()
                .verifyTextErrorRunCreation();
    }

    public String verifySharedReportWindowTitle(){
        return plansPage.openProject()
                .clickTestsRunButton()
                .openCreatedRun()
                .clickSharedReportButton()
                .getSharedReportTitle();

    }
}
