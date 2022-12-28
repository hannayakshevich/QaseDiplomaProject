package api.adapters;

import com.google.gson.Gson;
import io.restassured.response.Response;

import static api.utils.StringConstant.*;
import static io.restassured.RestAssured.given;


public class BaseAdapter {

    protected Gson converter = new Gson();

    protected Response get(String url, String specificCaseCode, int specificCaseId){
        return
                given()
                        .header(TOKEN_NAME, TOKEN_VALUE)
                        .when()
                        .log().all()
                        .get(BASE_URL + url + specificCaseCode + specificCaseId)
                        .then()
                        .log().all()
                        .extract().response();
    }

    protected Response post(String url, String body){
        return
                given()
                        .header(TOKEN_NAME, TOKEN_VALUE)
                        .header(CONTENT_TYPE, JSON)
                        .log().all()
                        .body(body)
                        .when()
                        .post(BASE_URL + url)
                        .then()
                        .log().all()
                        .extract().response();
    }

    protected Response post(String url,String projectCode, String body){
        return
                given()
                        .header(TOKEN_NAME, TOKEN_VALUE)
                        .header(CONTENT_TYPE, JSON)
                        .log().all()
                        .body(body)
                        .when()
                        .post(BASE_URL + url + projectCode)
                        .then()
                        .log().all()
                        .extract().response();
    }

    protected Response delete(String url, String projectCode){
        return
                given()
                        .header(TOKEN_NAME, TOKEN_VALUE)
                        .when()
                        .log().all()
                        .delete(BASE_URL + url + projectCode)
                        .then()
                        .log().all()
                        .extract().response();
    }

    protected Response patch(String url, String projectCode, int caseId, String body){
        return
                given()
                        .header(TOKEN_NAME, TOKEN_VALUE)
                        .header(CONTENT_TYPE, JSON)
                        .log().all()
                        .body(body)
                        .when()
                        .patch(BASE_URL + url + projectCode + caseId)
                        .then()
                        .log().all()
                        .extract().response();
    }
}
