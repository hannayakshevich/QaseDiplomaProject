package api.adapters;

import api.models.Case;
import api.models.Project;
import io.restassured.response.Response;

import static api.utils.StringConstant.CASE_API_ENDPOINT;

public class CaseAdapter extends BaseAdapter{

    public Response getSpecificCase(String specificCaseCode, int specificCaseId){
        return get(CASE_API_ENDPOINT, specificCaseCode, specificCaseId);
    }
    public Response CreateNewCase(Case newCase, String specificCaseCode) {
        return post(CASE_API_ENDPOINT, specificCaseCode, converter.toJson((newCase)));
    }

    public Response PatchCase(Case newCase, String specificCaseCode, int caseId) {
        return patch(CASE_API_ENDPOINT, specificCaseCode, caseId, converter.toJson((newCase)));
    }
}
