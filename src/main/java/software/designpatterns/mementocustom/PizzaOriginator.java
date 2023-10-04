package software.designpatterns.mementocustom;

import java.util.ArrayList;
import java.util.List;
import software.designpatterns.utils.ListUtil;

public class PizzaOriginator extends IMemento<PizzaOriginator> {

    private String name;
    private List<String> ingredients;

    private PizzaOriginator() {
        this.ingredients = new ArrayList<>();
    }

    private PizzaOriginator(String name, List<String> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public static PizzaOriginator build() {
        return new PizzaOriginator();
    }

    public String getName() {
        return name;
    }

    public PizzaOriginator setName(String name) {
        this.name = name;

        return this;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public PizzaOriginator addIngredient(String ingredient) {
        this.ingredients.add(ingredient);

        return this;
    }

    @Override
    protected PizzaOriginator copy() {
        return new PizzaOriginator(this.name, ListUtil.clone(ingredients));
    }

    @Override
    protected void redo(PizzaOriginator state) {
        this.name = state.name;
        this.ingredients = state.ingredients;
    }

    @Override
    public String toString() {
        String ingredientsPrint = this.ingredients.stream().reduce("", (acc, value) -> acc + value + "\n");

        return String.format("Nome: %s\nIngredientes:\n%s", this.name, ingredientsPrint);
    }
}
