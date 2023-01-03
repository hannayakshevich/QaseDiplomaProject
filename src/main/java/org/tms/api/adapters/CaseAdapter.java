package org.tms.api.adapters;

import org.tms.api.models.Case;
import io.restassured.response.Response;
import org.tms.api.utils.StringConstant;

public class CaseAdapter extends BaseAdapter{

    public Response getSpecificCase(String specificCaseCode, int specificCaseId){
        return get(StringConstant.CASE_API_ENDPOINT, specificCaseCode, specificCaseId);
    }
    public Response createNewCase(Case newCase, String specificCaseCode) {
        return post(StringConstant.CASE_API_ENDPOINT, specificCaseCode, converter.toJson((newCase)));
    }

    public Response patchCase(Case newCase, String specificCaseCode, int caseId) {
        return patch(StringConstant.CASE_API_ENDPOINT, specificCaseCode, caseId, converter.toJson((newCase)));
    }
}
