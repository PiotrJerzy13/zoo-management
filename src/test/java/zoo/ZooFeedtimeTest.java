package zoo;

import animals.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZooFeedtimeTest {

    @Test
    void printsWhichKeeperFeedsWhichAnimal() {
        var keepers = new Zookeeper[] {
                new Zookeeper("John", Consumption.HERBIVORES),
                new Zookeeper("Jane", Consumption.CARNIVORES),
                new Zookeeper("Omar", Consumption.OMNIVORES)
        };
        var animals = new animals.Animal[] {
                new Zebra("Stripes"),
                new Lion("Leo"),
                new Mandrill("Azibo")
        };
        var zoo = new Zoo(keepers, animals);

        try (var io = new TestIO()) {
            zoo.feedtime();
            var out = io.out();

            assertTrue(out.contains("John feeds the Zebra \"Stripes\" (HERBIVORES)"), out);
            assertTrue(out.contains("Jane feeds the Lion \"Leo\" (CARNIVORES)"), out);
            assertTrue(out.contains("Omar feeds the Mandrill \"Azibo\" (OMNIVORES)"), out);
        }
    }

    @Test
    void printsNoKeeperIfNoneMatches() {
        var keepers = new Zookeeper[] { new Zookeeper("John", Consumption.HERBIVORES) };
        var animals = new animals.Animal[] { new Lion("Leo") };
        var zoo = new Zoo(keepers, animals);

        try (var io = new TestIO()) {
            zoo.feedtime();
            var out = io.out();
            assertTrue(out.contains("No keeper can feed Lion \"Leo\" (CARNIVORES)"), out);
        }
    }
}
