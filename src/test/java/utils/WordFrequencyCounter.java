package utils;

import dto.PostDto;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequencyCounter {
    private static final Logger logger = (Logger) LoggerFactory.getLogger(WordFrequencyCounter.class);

    public static List<Map.Entry<String, Integer>> getTopWords(List<PostDto> posts, int limit) {
        Map<String, Integer> wordCounts = new HashMap<>();

        for (PostDto post : posts) {
            if (post.getBody() != null) {
                String[] words = post.getBody().toLowerCase().split("\\s+");
                for (String word : words) {
                    wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                }
            }
        }

        List<Map.Entry<String, Integer>> topWords = wordCounts.entrySet().stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .limit(limit)
                .collect(Collectors.toList());

        // Логируем результат
        logger.info(() -> "Топ " + limit + " слов:");
        int index = 1;
        for (Map.Entry<String, Integer> entry : topWords) {
            int finalIndex = index++; // Локальная переменная нужна, так как внутри лямбды index не изменится
            logger.info(() -> finalIndex + ". " + entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("Топ " + limit + " слов:");

        int index1 = 1;
        for (Map.Entry<String, Integer> entry : topWords) {
            int finalIndex = index1++; // Локальная переменная для использования в лямбде
            System.out.println(finalIndex + ". " + entry.getKey() + " - " + entry.getValue());
        }


        return topWords;
    }
}
