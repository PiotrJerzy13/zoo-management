package animals;
import zoo.Consumption;


public class Rhino extends Animal {
    public Rhino(String name) { super(name, Consumption.HERBIVORES); }
    @Override public void makeSound() {
        System.out.println(getName() + " the " + typeName() + " moos");
    }
}


