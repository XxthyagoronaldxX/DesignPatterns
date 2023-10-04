package software.designpatterns.memento;

public class MementoApp {

    public static void main(String[] args) {
        Caretaker<BurguerMemento> careTakerBurguer = new Caretaker();
        
        BurguerOriginator burguerOriginator = BurguerOriginator.build()
                .setName("X-Tudo")
                .addIngredient("Ovo");
        
        careTakerBurguer.addSnapshot(burguerOriginator.save());
        
        burguerOriginator.addIngredient("Alface").addIngredient("Carne");
        
        careTakerBurguer.addSnapshot(burguerOriginator.save());
        
        burguerOriginator.addIngredient("Batata");
        
        System.out.println(burguerOriginator);
        
        burguerOriginator.restore(careTakerBurguer.getRecentSnapshot());
        
        System.out.println(burguerOriginator);
        
        burguerOriginator.restore(careTakerBurguer.getRecentSnapshot());
        
        System.out.println(burguerOriginator);
    }
}
