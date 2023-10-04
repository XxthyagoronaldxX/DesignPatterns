package software.designpatterns.memento;

public interface IOriginator<M> {

    public M save();

    public void restore(M memento);
}
