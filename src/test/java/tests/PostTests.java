package tests;

import io.restassured.response.Response;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import api.PostsApi;
import dto.PostDto;

import static org.hamcrest.Matchers.equalTo;

public class PostTests extends BaseTest {

    @ParameterizedTest
    @MethodSource("providers.PostsDataProvider#validCreatePostProvider")
    void createPostTest(PostDto post) {
        Response response = PostsApi.createPost(post);
        response.then()
                .statusCode(201)
                .body("title", equalTo(post.getTitle()))
                .body("body", equalTo(post.getBody()));
    }

    @ParameterizedTest
    @MethodSource("providers.PostsDataProvider#validDeletePostProvider")
    void deletePostTest(int postId) {
        Response response = PostsApi.deletePost(postId);
        response.then()
                .statusCode(200); // JSONPlaceholder всегда возвращает 200 на DELETE
    }
}
