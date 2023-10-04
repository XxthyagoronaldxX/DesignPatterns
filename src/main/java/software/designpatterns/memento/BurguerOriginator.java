package software.designpatterns.memento;

import java.util.ArrayList;
import java.util.List;

public class BurguerOriginator implements IOriginator<BurguerMemento> {

    private String name;
    private List<String> ingredients;

    private BurguerOriginator() {
        this.ingredients = new ArrayList<>();
    }

    public static BurguerOriginator build() {
        return new BurguerOriginator();
    }

    public String getName() {
        return name;
    }

    public BurguerOriginator setName(String name) {
        this.name = name;

        return this;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public BurguerOriginator addIngredient(String ingredient) {
        this.ingredients.add(ingredient);

        return this;
    }

    @Override
    public BurguerMemento save() {
        return new BurguerMemento(this);
    }

    @Override
    public void restore(BurguerMemento memento) {
        this.name = memento.getName();
        this.ingredients = memento.getIngredients();
    }

    @Override
    public String toString() {
        String ingredientsPrint = this.ingredients.stream().reduce("", (acc, value) -> acc + value + "\n");
        
        return String.format("Nome: %s\nIngredientes:\n%s", this.name, ingredientsPrint);
    }
}
