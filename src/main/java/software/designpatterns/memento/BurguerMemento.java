package software.designpatterns.memento;

import java.util.List;
import software.designpatterns.utils.ListUtil;

public class BurguerMemento implements IMemento {

    private final String name;
    private final List<String> ingredients;

    public BurguerMemento(BurguerOriginator originator) {
        this.name = originator.getName();
        this.ingredients = ListUtil.clone(originator.getIngredients());
    }

    public String getName() {
        return name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

}
