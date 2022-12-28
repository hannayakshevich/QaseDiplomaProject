package org.tms.services;

import lombok.extern.log4j.Log4j2;
import org.tms.model.User;
import org.tms.pages.LoginPage;
import org.tms.pages.ProjectsPage;

@Log4j2
public class LoginPageService {
    private static final String LOGIN_PAGE_URL = "https://app.qase.io/login";
    protected LoginPage loginPage = new LoginPage();

    public ProjectsPage login(User user){
        log.info("Login to Qase");
        loginPage.openPage(LOGIN_PAGE_URL)
                .fillInUsername(user.getLogin())
                .fillInPassword(user.getPassword())
                .clickLoginButton();
        return new ProjectsPage();
    }
}
