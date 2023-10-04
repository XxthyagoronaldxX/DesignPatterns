package software.designpatterns.memento;

import java.util.Stack;

public class Caretaker<T> {

    private final Stack<T> history;

    public Caretaker() {
        this.history = new Stack<>();
    }

    public void addSnapshot(T burguerMemento) {
        this.history.add(burguerMemento);
    }

    public T getRecentSnapshot() {
        return this.history.pop();
    }
}
