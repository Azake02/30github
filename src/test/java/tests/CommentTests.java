package tests;

import api.ApiClient;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

public class CommentTests extends BaseTest{
    private static final String COMMENTS_ENDPOINT = "/comments";

    @Test
    void getCommentById(){
        Response response = ApiClient.get(COMMENTS_ENDPOINT + "/1");
        response.then()
                .statusCode(200)
                .body("id", equalTo(1));
    }
}
