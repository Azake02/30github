package posts;

import api.PostsApi;
import dto.PostDto;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;
import utils.WordFrequencyCounter;

import java.util.List;
import java.util.Map;

public class WordFrequencyTest extends BaseTest{

    @Test
    @Description("Тест на вывод в лог топ 10 слов в постах")
    @Feature("Топ 10 слов")
    @Story("Проверка на получение топ 10 слов")
    void findTop10FrequentWordsInPosts() {
        List<PostDto> posts = PostsApi.getAllPosts();
        List<Map.Entry<String, Integer>> topWords = WordFrequencyCounter.getTopWords(posts, 10);

        // Проверяем, что список не пустой
        assert !topWords.isEmpty();
    }
}
