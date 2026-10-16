package uz.learn;

import uz.learn.memento.Editor;
import uz.learn.memento.History;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        editor.setContent("Salom");
        history.push(editor.createState()); // Tarixga saqlash

        editor.setContent("Salom, Dunyo!");
        history.push(editor.createState()); // Tarixga saqlash

        editor.setContent("Salom, Dunyo bugun Juma.");

        System.out.println("Hozirgi matn: " + editor.getContent());

        editor.restore(history.pop());

        System.out.println("Ctrl+Z dan keyin: " + editor.getContent());

        editor.restore(history.pop());
        System.out.println("Ikkinchi marta Ctrl+Z dan keyin: " + editor.getContent());
    }

}
