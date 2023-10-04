package software.designpatterns.mementocustom;

import java.util.Stack;

public abstract class IMemento<T> {

    protected Stack<T> history;

    protected IMemento() {
        this.history = new Stack<>();
    }

    public void save() {
        this.history.push(this.copy());
    }

    public void restore() {
        this.redo(this.history.pop());
    }
    
    abstract protected T copy();

    abstract protected void redo(T state);
}
