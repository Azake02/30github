package tests;

import config.ConfigManager;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
    @BeforeAll
    static void setup(){
        RestAssured.baseURI = ConfigManager.get("baseUrl");
    }
}
