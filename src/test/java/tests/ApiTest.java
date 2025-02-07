package tests;

import config.ConfigManager;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ApiTest {
    @Test
    void testExample(){
        RestAssured.baseURI = ConfigManager.get("baseUrl");
        given()
                .when()
                .get("posts/1")
                .then()
                .statusCode(200)
                .body("id", equalTo(1));
    }
}
