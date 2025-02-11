package providers;

import dto.PostDto;

import java.util.stream.Stream;

public class PostsDataProvider {
    public static Stream<PostDto> validCreatePostProvider() {
        return Stream.of(
                new PostDto(0, 1, "Test title 1", "Test body 1"),
                new PostDto(-1, 10, "Test title 2", "Test body 2"),
                new PostDto(100, 3, "", "Test body 3"),
                new PostDto(101, 4, "Test title 4", ""),
                new PostDto(1, 5, "", ""),
                new PostDto(1, 6, " ", " "),
                new PostDto(1, 7, "Very long title".repeat(10), "Very long body".repeat(10)),
                new PostDto(null, 8, "Test title 8", "Test body 8")
        );
    }
}
