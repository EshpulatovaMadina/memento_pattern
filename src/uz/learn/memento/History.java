package uz.learn.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * CareTaker (Tarixni/Stack ni boshqaruvchi)
 */
public class History {
    private final List<EditorState> states = new ArrayList<>();

    public void push(EditorState state) {
        states.add(state);
    }

    public EditorState pop() {
        if(states.isEmpty()) {
            return null;
        }

        // Oxirgi state ni sug'urib olish (CTRL + Z)
        int lastIndex = states.size() - 1;
        EditorState lastState = states.get(lastIndex);
        states.remove(lastIndex);

        return lastState;
    }
}
