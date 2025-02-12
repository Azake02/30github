package api;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import dto.PostDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PostsApi {
    private static final String POSTS_ENDPOINT = "/posts";
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static Response createPost(PostDto post) {
        String requestBody;
        try {
            requestBody = objectMapper.writeValueAsString(post);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Failed to serialize PostDto", e);
        }

        return given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post(POSTS_ENDPOINT);
    }

    public static Response deletePost(int postId) {
        return given()
                .header("Accept", "application/json") // Явно указываем ожидаемый формат ответа
                .when()
                .delete(POSTS_ENDPOINT + "/" + postId)
                .then()
                .extract()
                .response();
    }
}
