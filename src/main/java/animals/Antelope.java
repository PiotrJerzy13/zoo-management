package animals;
import zoo.Consumption;


public class Antelope extends Animal {
    public Antelope(String name) { super(name, Consumption.HERBIVORES); }
    @Override public void makeSound() {
        System.out.println(getName() + " the " + typeName() + " snorts");
    }
}

