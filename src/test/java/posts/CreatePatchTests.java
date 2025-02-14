package posts;

import api.PatchApi;
import io.restassured.response.Response;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import dto.PostDto;

import static org.hamcrest.Matchers.equalTo;

public class CreatePatchTests extends BaseTest {

    @ParameterizedTest
    @MethodSource("providers.PostsDataProvider#validPatchAndPutProvider")
    void createPatchTest(PostDto post) {
        Response response = PatchApi.patchPost(post);
        response.then()
                .statusCode(200)
                .body("title", equalTo(post.getTitle()))
                .body("body", equalTo(post.getBody()));
    }
}
