package uz.learn.memento;
/**
 * Memento (Holatni saqlovchi snapshot obyekti)
 */
public class EditorState {

    private final String content;

    public EditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
