package animals;
import zoo.Consumption;


public class Zebra extends Animal {
    public Zebra(String name) { super(name, Consumption.HERBIVORES); }
    @Override public void makeSound() {
        System.out.println(getName() + " the " + typeName() + " brays");
    }
}

