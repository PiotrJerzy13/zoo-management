package zoo;

import animals.Animal;
import animals.Antelope;
import animals.Hippo;
import animals.Lion;
import animals.Mandrill;
import animals.Rhino;
import animals.Zebra;

public class Application {
    public static void main(String[] args) {
        Application app = new Application();
        app.run();
    }

    private void run() {
        Zoo zoo = new Zoo(
                new Zookeeper[]{
                        new Zookeeper("John", Consumption.HERBIVORES),
                        new Zookeeper("Jane", Consumption.CARNIVORES, Consumption.OMNIVORES)},
                new Animal[]{
                        new Zebra("Stripes"), new Zebra("Shadow"), new Zebra("Zephir"),
                        new Antelope("Luna"), new Antelope("Thunder"), new Antelope("Sage"), new Antelope("Orion"),
                        new Hippo("Bubbles"), new Hippo("Tank"),
                        new Rhino("Brutus"), new Rhino("Avalanche"), new Rhino("Titan"),
                        new Lion("Leo"), new Lion("Nala"),
                        new Mandrill("Azibo"), new Mandrill("Kaya"), new Mandrill("Zuri"), new Mandrill("Simba")
                });
        zoo.feedtime();
    }
}
