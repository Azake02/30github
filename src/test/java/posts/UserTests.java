package posts;

import api.ApiClient;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

public class UserTests extends BaseTest{
    private static final String USERS_ENDPOINT = "/users";
    @Test
    void getUserById() {
        Response response = ApiClient.get(USERS_ENDPOINT + "/1");
        response.then()
                .statusCode(200)
                .body("id", equalTo(1));
    }

    @Test
    void createUser(){
        String requestBody = "{ \"name\": \"John Doe\", \"email\": \"john@example.com\" }";
        Response response = ApiClient.post(USERS_ENDPOINT, requestBody);
        response.then()
                .statusCode(201)
                .body("name", equalTo("John Doe"));
    }

    @Test
    void deleteUser(){
        Response response = ApiClient.delete(USERS_ENDPOINT + "/1");
        response.then()
                .statusCode(200);
    }

}
