package posts;

import api.PostsApi;
import dto.PostDto;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import io.qameta.allure.Description;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.hamcrest.Matchers.equalTo;

public class CreatePostTests extends BaseTest{
    @ParameterizedTest(name = "Create post {0} successfully")
    @MethodSource("providers.PostsDataProvider#validCreatePostProvider")
    @Description("Проверка на создание пост запросов")
    @Feature("Пост запрос")
    @Story("Создание пост запросов")
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
