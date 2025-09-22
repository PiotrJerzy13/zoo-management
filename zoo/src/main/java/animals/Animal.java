package animals;
import zoo.Consumption;


public abstract class Animal {
    private final String name;
    private final Consumption diet;

    protected Animal(String name, Consumption diet) {
        this.name = name;
        this.diet = diet;
    }

    public String getName() { return name; }
    public Consumption getDiet() { return diet; }

    public abstract void makeSound();

    protected String typeName() { return getClass().getSimpleName(); }
}

