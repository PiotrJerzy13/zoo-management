package animals;

import org.junit.jupiter.api.Test;
import zoo.Consumption;

import static org.junit.jupiter.api.Assertions.*;

class AnimalDietTest {

    @Test
    void lionIsCarnivore() {
        var a = new Lion("Leo");
        assertEquals(Consumption.CARNIVORES, a.getDiet());
    }

    @Test
    void zebraIsHerbivore() {
        var a = new Zebra("Stripes");
        assertEquals(Consumption.HERBIVORES, a.getDiet());
    }

    @Test
    void antelopeIsHerbivore() {
        var a = new Antelope("Luna");
        assertEquals(Consumption.HERBIVORES, a.getDiet());
    }

    @Test
    void hippoIsHerbivore() {
        var a = new Hippo("Bubbles");
        assertEquals(Consumption.HERBIVORES, a.getDiet());
    }

    @Test
    void rhinoIsHerbivore() {
        var a = new Rhino("Brutus");
        assertEquals(Consumption.HERBIVORES, a.getDiet());
    }

    @Test
    void mandrillIsOmnivore() {
        var a = new Mandrill("Azibo");
        assertEquals(Consumption.OMNIVORES, a.getDiet());
    }
}
