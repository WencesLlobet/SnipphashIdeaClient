public class Snippet {
    private SnippetTitle title;
    private String body;

    public Snippet(SnippetTitle title, String body) {
        this.title = title;
        this.body = body;
    }

    public String getTitle() {
        return title.toString();
    }

    public String getBody() {
        return body;
    }
}
