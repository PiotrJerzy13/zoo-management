package animals;
import zoo.Consumption;


public class Hippo extends Animal {
    public Hippo(String name) { super(name, Consumption.HERBIVORES); }
    @Override public void makeSound() {
        System.out.println(getName() + " the " + typeName() + " barks");
    }
}

