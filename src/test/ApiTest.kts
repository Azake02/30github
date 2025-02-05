import io.restassured.RestAssured
import io.restassured.response.Response
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ApiTest {

    @Test
    fun `check GET request`() {
        val response: Response = RestAssured.get("https://jsonplaceholder.typicode.com/posts/1")

        assertEquals(200, response.statusCode)
        println("Response body: ${response.body.asString()}")
    }
}
