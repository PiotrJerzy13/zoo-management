package zoo;

import animals.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZookeeperTest {

    @Test
    void herbivoreKeeperFeedsHerbivoresOnly() {
        var keeper = new Zookeeper("John", Consumption.HERBIVORES);

        assertTrue(keeper.canFeed(new Zebra("Z1")));
        assertTrue(keeper.canFeed(new Antelope("A1")));
        assertTrue(keeper.canFeed(new Hippo("H1")));
        assertTrue(keeper.canFeed(new Rhino("R1")));

        assertFalse(keeper.canFeed(new Lion("L1")));
        assertFalse(keeper.canFeed(new Mandrill("M1")));
    }

    @Test
    void carnivoreKeeperFeedsCarnivoresOnly() {
        var keeper = new Zookeeper("Jane", Consumption.CARNIVORES);

        assertTrue(keeper.canFeed(new Lion("L1")));
        assertFalse(keeper.canFeed(new Zebra("Z1")));
        assertFalse(keeper.canFeed(new Mandrill("M1"))); // omnivore != carnivore in this model
    }

    @Test
    void omnivoreKeeperFeedsOmnivoresOnly() {
        var keeper = new Zookeeper("Omar", Consumption.OMNIVORES);

        assertTrue(keeper.canFeed(new Mandrill("M1")));
        assertFalse(keeper.canFeed(new Zebra("Z1")));
        assertFalse(keeper.canFeed(new Lion("L1")));
    }

    @Test
    void multiSpecializedKeeperWorksForAnyOfGivenDiets() {
        var keeper = new Zookeeper("Alex", Consumption.HERBIVORES, Consumption.CARNIVORES);

        assertTrue(keeper.canFeed(new Zebra("Z1")));
        assertTrue(keeper.canFeed(new Lion("L1")));
        assertFalse(keeper.canFeed(new Mandrill("M1"))); // omnivores not included
    }
}
