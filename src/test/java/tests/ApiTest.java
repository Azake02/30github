package tests;

import config.ConfigManager;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ApiTest extends BaseTest{
    @Test
    void testExample(){
        given()
                .when()
                .get("posts/1")
                .then()
                .statusCode(200)
                .body("id", equalTo(1));
    }
}
