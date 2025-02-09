package tests;

import api.ApiClient;
import io.restassured.response.Response;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.hamcrest.Matchers.equalTo;

public class CommentTests extends BaseTest{
    private static final String COMMENTS_ENDPOINT = "/comments";

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5})
    void getCommentById(int id){
        Response response = ApiClient.get(COMMENTS_ENDPOINT + "/" + id);
        response.then()
                .statusCode(200)
                .body("id", equalTo(id));
    }
}
