package animals;
import zoo.Consumption;


public class Mandrill extends Animal {
    public Mandrill(String name) { super(name, Consumption.OMNIVORES); }
    @Override public void makeSound() {
        System.out.println(getName() + " the " + typeName() + " screams");
    }
}
