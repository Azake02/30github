package api;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class DeleteApi {
    private static final String POSTS_ENDPOINT = "/posts";

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
