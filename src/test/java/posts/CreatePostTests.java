package posts;

import api.PostsApi;
import dto.PostDto;
import io.restassured.response.Response;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.hamcrest.Matchers.equalTo;

public class CreatePostTests extends BaseTest{
    @ParameterizedTest(name = "Create post {0} successfully")
    @MethodSource("providers.PostsDataProvider#validCreatePostProvider")
    void createPostTests(PostDto post){
        Response response = PostsApi.createPost(post);
        response.then()
                .statusCode(201)
                .body("title", equalTo(post.getTitle()))
                .body("body", equalTo(post.getBody()));



    }

    @ParameterizedTest(name = "Create post {0} unsuccefully")
    @MethodSource("providers.PostsDataProvider#invalidCreatePostProvider")
    void createPostTestsInvalid(PostDto post){
        Response response = PostsApi.createPost(post);
        response.then()
                .statusCode(201)
                .body("title", equalTo(post.getTitle()))
                .body("body", equalTo(post.getBody()));
    }
}
