package reusablepackages;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class RestUtil {

    public static Response postRequest(String uri, Map<String, Object>requestPayload, Map<String, String> params){

              return  RestAssured
                        .given()
                .baseUri(uri)
                .contentType(ContentType.JSON)
                .body(requestPayload)
                .headers(params)
                .post()
                .then().log().all().extract().response();


    }
}
