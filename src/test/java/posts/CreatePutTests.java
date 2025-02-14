package posts;

import api.PutApi;
import dto.PostDto;
import io.restassured.response.Response;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.hamcrest.Matchers.equalTo;

public class CreatePutTests extends BaseTest{
    @ParameterizedTest
    @MethodSource("providers.PostsDataProvider#validPatchAndPutProvider")
    void putPostTest(PostDto post){
        Response response = PutApi.putPost(post);
        response.then()
                .statusCode(200)
                .body("title", equalTo(post.getTitle()))
                .body("body", equalTo(post.getBody()))
                .body("userId", equalTo(post.getUserId()));
    }
}
