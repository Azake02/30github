package posts;

import api.ApiClient;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

public class ApiTest extends BaseTest{
    @Test
    @Description("Проверка на гет запрос")
    @Feature("Patch post")
    @Story("Получение данных поста под айди 1")
    void testId(){
        ApiClient.get("posts/1")
                .then()
                .statusCode(200)
                .body("id", equalTo(1));
    }
}
