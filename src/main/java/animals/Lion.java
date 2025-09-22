package animals;
import zoo.Consumption;


public class Lion extends Animal {
    public Lion(String name) { super(name, Consumption.CARNIVORES); }
    @Override public void makeSound() {
        System.out.println(getName() + " the " + typeName() + " roars");
    }
}

