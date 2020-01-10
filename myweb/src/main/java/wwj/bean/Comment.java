package wwj.bean;

public class Comment {
    Integer id;
    String author_name;
    String content;
    String author_url;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor_url() {
        return author_url;
    }

    public void setAuthor_url(String author_url) {
        this.author_url = author_url;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", author_name='" + author_name + '\'' +
                ", content='" + content + '\'' +
                ", author_url='" + author_url + '\'' +
                '}';
    }
}
