package posts;

import api.ApiClient;
import com.fasterxml.jackson.databind.ser.Serializers;
import data.AlbumTestData;
import dto.PostDto;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.hamcrest.Matchers.equalTo;

public class AlbumsTest extends BaseTest {
    private static final String ALBUMS_ENDPOINT = "/albums/";


    @ParameterizedTest(name = "get all albums with id from 1 to 10")
    @MethodSource("providers.PostsDataProvider#validGetAlbums")
    @Description("Получение альбомов с айди от 1 до 10")
    @Feature("Гет на альбомы")
    @Story("Базовый запрос по получению инфы по альбомам")
    void getAlbumById(Integer albumId){
        Response response = ApiClient.get(ALBUMS_ENDPOINT+albumId);
        response.then()
                .statusCode(200)
                .body("id", equalTo(albumId))
                .body("title", equalTo(AlbumTestData.EXPECTED_ALBUMS.get(albumId)));
    }
}
