package posts;

import config.ConfigManager;
import io.restassured.RestAssured;
import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
    @BeforeAll
    static void setup(){
        RestAssured.baseURI = ConfigManager.get("baseUrl");

        // Добавляем фильтры для логирования
        RestAssured.filters(
                new RequestLoggingFilter(LogDetail.ALL),  // Логирует весь запрос
                new ResponseLoggingFilter(LogDetail.ALL) // Логирует весь ответ
        );
    }
}
