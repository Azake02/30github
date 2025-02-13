package posts;

import api.PostsApi;
import dto.PostDto;
import org.junit.jupiter.api.Test;
import utils.WordFrequencyCounter;

import java.util.List;
import java.util.Map;

public class WordFrequencyTest extends BaseTest{

    @Test
    void findTop10FrequentWordsInPosts() {
        List<PostDto> posts = PostsApi.getAllPosts();
        List<Map.Entry<String, Integer>> topWords = WordFrequencyCounter.getTopWords(posts, 10);

        // Проверяем, что список не пустой
        assert !topWords.isEmpty();
    }
}
