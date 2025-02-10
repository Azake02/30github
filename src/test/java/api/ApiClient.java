package api;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ApiClient {
    public static Response get(String endpoint){
        return given()
                .contentType(ContentType.JSON)
                .when()
                .get(endpoint);
    }

    public static Response post(String endpoint, Object body){
        return given()
                .contentType(ContentType.JSON)
                .body(body)
                .when().
                post(endpoint);
    }

    public static Response delete(String endpoint){
        return given()
                .contentType(ContentType.JSON)
                .when().
                delete(endpoint);
    }

}
