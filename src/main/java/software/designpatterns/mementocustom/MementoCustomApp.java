package software.designpatterns.mementocustom;

public class MementoCustomApp {

    public static void main(String[] args) {
        PizzaOriginator pizzaOriginator = PizzaOriginator.build()
                .setName("Pizza de Calabresa")
                .addIngredient("Queijo");

        pizzaOriginator.save();

        pizzaOriginator.addIngredient("Molho de tomate");

        System.out.println(pizzaOriginator);

        pizzaOriginator.restore();

        System.out.println(pizzaOriginator);
    }
}
