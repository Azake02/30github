package posts;

import api.PatchApi;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import io.qameta.allure.Description;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import dto.PostDto;

import static org.hamcrest.Matchers.equalTo;

public class CreatePatchTests extends BaseTest {

    @ParameterizedTest
    @MethodSource("providers.PostsDataProvider#validPatchAndPutProvider")
    @Description("Частичное изменение поста")
    @Feature("Patch method")
    @Story("Проверка на изменение каждого параметра пост по отдельности")
    void createPatchTest(PostDto post) {
        Response response = PatchApi.patchPost(post);
        response.then()
                .statusCode(200)
                .body("title", equalTo(post.getTitle()))
                .body("body", equalTo(post.getBody()));
    }
}
