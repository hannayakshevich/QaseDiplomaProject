package org.tms.services;

import org.tms.pages.RunsPage;

public class RunsPageService {

    protected RunsPage plansPage = new RunsPage();

//    public String createNewRun(){
//        return plansPage.openProject()
//                .clickTestsRunLink()
//                .clickCreateRunButton()
//                .clickAddRunCasesButton()
//                .clickCasesRunCheckBox()
//                .clickDoneRunButton()
//                .clickSaveRunButton()
//                .verifyCreatedRun();
//    }

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
