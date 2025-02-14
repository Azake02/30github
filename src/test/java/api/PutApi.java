package api;

import com.fasterxml.jackson.core.JsonProcessingException;
import dto.PostDto;

import io.restassured.response.Response;
import com.fasterxml.jackson.databind.ObjectMapper;

import static io.restassured.RestAssured.given;

public class PutApi {
    private static final String PUT_ENDPOINT = "/posts/1";
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static Response putPost(PostDto post) {
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
                .put(PUT_ENDPOINT);
    }
}
