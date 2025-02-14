package api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dto.PostDto;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class PatchApi {
    private static final String PATCH_ENDPOINT = "/posts/1";
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static Response patchPost(PostDto post){
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
                .patch(PATCH_ENDPOINT);
    }
}
