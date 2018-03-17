package creational.prototype.naive;

public class Paper {
    private String content;

    public Paper(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void show() {
        System.out.println(content);
    }
}
