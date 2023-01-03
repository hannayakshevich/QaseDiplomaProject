package org.tms.services;

import org.tms.pages.RunsPage;

public class RunsPageService {

    private RunsPage plansPage = new RunsPage();

    public String errorRunCreation(){

        return plansPage.openProject()
                .clickTestsRunLink()
                .clickCreateRunButton()
                .clickSaveRunButton()
                .getTextErrorRunCreation();
    }

    public String verifySharedReportWindowTitle(){

        return plansPage.openProject()
                .clickTestsRunLink()
                .openCreatedRun()
                .clickSharedReportButton()
                .getSharedReportTitle();

    }
}
