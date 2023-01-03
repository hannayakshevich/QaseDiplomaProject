package org.tms.api.adapters;

import org.tms.api.models.Project;
import io.restassured.response.Response;
import org.tms.api.utils.StringConstant;

public class ProjectAdapter extends BaseAdapter{

    public Response createProject(Project project){
        return post(StringConstant.PROJECT_API_ENDPOINT, converter.toJson((project)));
    }

    public Response deleteProject(String projectCode){
        return delete(StringConstant.PROJECT_API_ENDPOINT, projectCode);
    }
}
