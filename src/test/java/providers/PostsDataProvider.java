package providers;

import dto.PostDto;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.IntStream;
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

    public static Stream<PostDto> invalidCreatePostProvider(){
        return Stream.of(
                new PostDto(1, null, "Test title 1", "Test body 1"),
                new PostDto(1, 1, null, "Test body 2"),
                new PostDto(1, 1, "Test title 3", null)
        );
    }

    public static Stream<Integer> validDeletePostProvider() {
        return Stream.of(0, -1, 100, 101, 1);
    }

    public static Stream<Arguments> validPatchAndPutProvider(){
        return Stream.of(
                Arguments.of(new PostDto(null, null, "new title", null)),
                Arguments.of(new PostDto(null, null, null, "new body")),
                Arguments.of(new PostDto(null, 3, null, null)),
                Arguments.of( new PostDto(4, null, null, null))
        );
    }

    public static Stream<Integer> validGetAlbums(){
        return IntStream.rangeClosed(1, 10).boxed();
    }
}
