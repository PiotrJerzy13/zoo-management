package zoo;

import animals.Animal;

public class Zoo {

    private final Zookeeper[] zookeepers;
    private final Animal[] animals;

    public Zoo(Zookeeper[] zookeepers, Animal[] animals) {
        this.zookeepers = zookeepers;
        this.animals = animals;
    }

    public void feedtime() {
        for (Animal animal : animals) {
            boolean fed = false;
            for (Zookeeper keeper : zookeepers) {
                if (keeper.canFeed(animal)) {
                    System.out.println(keeper.getName() + " feeds the "
                            + animal.getClass().getSimpleName() + " \"" + animal.getName()
                            + "\" (" + animal.getDiet() + ")");
                    fed = true;
                    break; // stop at first keeper who can feed
                }
            }
            if (!fed) {
                System.out.println("No keeper can feed "
                        + animal.getClass().getSimpleName() + " \"" + animal.getName()
                        + "\" (" + animal.getDiet() + ")");
            }
        }
    }
}
