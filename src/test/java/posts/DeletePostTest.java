package posts;

import api.DeleteApi;
import io.restassured.response.Response;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DeletePostTest extends BaseTest{
    @ParameterizedTest
    @MethodSource("providers.PostsDataProvider#validDeletePostProvider")
    void deletePostTests(int postId){
        Response response = DeleteApi.deletePost(postId);
        response.then()
                .statusCode(200);
    }

}
