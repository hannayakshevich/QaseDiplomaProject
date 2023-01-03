package org.tms.services;

import org.tms.pages.PlansPage;

public class PlansPageService {

    private PlansPage plansPage = new PlansPage();

    public String createNewPlan(){

        return plansPage.openProject()
                .clickTestsPlanLink()
                .clickCreatePlanButton()
                .fillTitlePlanField()
                .clickAddCasesButton()
                .clickCasesCheckBox()
                .clickDoneButton()
                .clickSavePlanButton()
                .getTitleCreatedPlan();
    }

    public String errorPlanCreation(){

        return plansPage.openProject()
                .clickTestsPlanLink()
                .clickCreatePlanButton()
                .fillTitlePlanField()
                .clickSavePlanButton()
                .getTextErrorPlanCreation();
    }
}
