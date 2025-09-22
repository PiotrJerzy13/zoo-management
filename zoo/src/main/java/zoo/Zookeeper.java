package zoo;

import animals.Animal;
import java.util.EnumSet;
import java.util.Objects;

public class Zookeeper {
    private final String name;
    private final EnumSet<Consumption> specializations;

    // Main ctor
    public Zookeeper(String name, EnumSet<Consumption> specializations) {
        this.name = Objects.requireNonNull(name, "name");
        this.specializations = (specializations == null || specializations.isEmpty())
                ? EnumSet.noneOf(Consumption.class)
                : EnumSet.copyOf(specializations);
    }

    // Convenience varargs ctor so this works:
    // new Zookeeper("Jane", Consumption.CARNIVORES, Consumption.OMNIVORES)
    public Zookeeper(String name, Consumption... specializations) {
        this.name = Objects.requireNonNull(name, "name");
        if (specializations == null || specializations.length == 0) {
            this.specializations = EnumSet.noneOf(Consumption.class);
        } else {
            this.specializations = EnumSet.of(specializations[0], specializations);
        }
    }

    public String getName() {
        return name;
    }

    public boolean canFeed(Animal animal) {
        return animal != null && specializations.contains(animal.getDiet());
    }

    public String specializationsLabel() {
        return specializations.isEmpty() ? "(none)" : specializations.toString();
    }
}
