package posts;

import api.DeleteApi;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DeletePostTest extends BaseTest{
    @ParameterizedTest
    @MethodSource("providers.PostsDataProvider#validDeletePostProvider")
    @Description("Проверка на удаление поста")
    @Feature("Удаление")
    @Story("Удаление поста")
    void deletePostTests(int postId){
        Response response = DeleteApi.deletePost(postId);
        response.then()
                .statusCode(200);
    }
}
