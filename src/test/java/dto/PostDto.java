package dto;

public class PostDto {
    private Integer id;
    private Integer userId;
    private String title;
    private String body;

//    public PostDto() {
//        // Пустой конструктор нужен для десериализации
//    }

    public PostDto(Integer id, Integer userId, String title, String body) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.body = body;
    }

    // Getters
    public Integer getId() {
        return id;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    // Setters
    public void setId(Integer id) {
        this.id = id;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
