package api.tests;

import api.adapters.CaseAdapter;
import api.adapters.ProjectAdapter;
import api.models.Case;
import api.models.Project;
import io.restassured.response.ResponseBody;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.net.HttpURLConnection.HTTP_OK;

public class QaseApiTest {

    @Test(priority = 1)
    public void createNewProjectTest(){

        String title = "title";
        String description = "description";
        String code = "code";
        String access = "all";
        String group = "group";
        String actualCode = "CODE";

        Project project = Project.builder()
                .title(title)
                .code(code)
                .description(description)
                .access(access)
                .group(group)
                .build();
        String resultCode = new ProjectAdapter().createProject(project).body().path("result.code");
        Assert.assertEquals(resultCode, actualCode);
    }

    @Test (priority = 2, description = "run after createNewProjectTest")
    public void deleteProjectTest(){

        String projectCode = "/CODE";

        boolean status = new ProjectAdapter()
                .deleteProject(projectCode)
                .body().path("status");
        Assert.assertTrue(status);

    }

    @Test
    public void getSpecificCaseTest(){

        String specificCaseCode = "/AQA17/";
        int specificCaseId = 7;

        int actualCaseId = new CaseAdapter()
                .getSpecificCase(specificCaseCode, specificCaseId)
                .body().path("result.id");
        Assert.assertEquals(actualCaseId, specificCaseId);
    }

    @Test
    public void createCaseTest(){

         String  title = "title";
         String description = "description";
         int priority = 1;
         int severity = 2;
         String projectCode = "/AQA17";

         Case newCase = Case.builder()
                 .title(title)
                 .description(description)
                 .priority(priority)
                 .severity(severity)
                 .build();
         Boolean actualResult = new CaseAdapter()
                 .CreateNewCase(newCase, projectCode)
                 .body().path("status");
         Assert.assertTrue(actualResult);
    }

    @Test
    public void patchCaseTest(){

        String  title = "newTitle";
        String projectCode = "/AQA17/";
        int caseId = 3;

        Case newCase = Case.builder()
                .title(title)
                .build();
        Boolean actualResult = new CaseAdapter()
                .PatchCase(newCase, projectCode, caseId)
                .body().path("status");
        Assert.assertTrue(actualResult);
    }
}
