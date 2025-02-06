import io.restassured.RestAssured
import org.junit.jupiter.api.BeforeAll

open class BaseTest {
    companion object {
        @BeforeAll
        @JvmStatic
        fun setup() {
            RestAssured.baseURI = "https://jsonplaceholder.typicode.com"
        }
    }
}
