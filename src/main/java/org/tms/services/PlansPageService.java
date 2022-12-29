package org.tms.services;

import org.tms.pages.PlansPage;

public class PlansPageService {

    protected PlansPage plansPage = new PlansPage();

    public String createNewPlan(){
        return plansPage.openProject()
                .clickTestsPlanButton()
                .clickCreatePlanButton()
                .fillTitlePlanField()
                .clickAddCasesButton()
                .clickCasesCheckBox()
                .clickDoneButton()
                .clickSavePlanButton()
                .verifyCreatedPlan();
    }

    public String errorPlanCreation(){
        return plansPage.openProject()
                .clickTestsPlanButton()
                .clickCreatePlanButton()
                .fillTitlePlanField()
                .clickSavePlanButton()
                .verifyTextErrorPlanCreation();
    }
}
