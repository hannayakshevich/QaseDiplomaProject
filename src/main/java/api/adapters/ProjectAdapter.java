package api.adapters;

import api.models.Project;
import io.restassured.response.Response;

import static api.utils.StringConstant.PROJECT_API_ENDPOINT;

public class ProjectAdapter extends BaseAdapter{

    public Response createProject(Project project){
        return post(PROJECT_API_ENDPOINT, converter.toJson((project)));
    }

    public Response deleteProject(String projectCode){
        return delete(PROJECT_API_ENDPOINT, projectCode);
    }
}
