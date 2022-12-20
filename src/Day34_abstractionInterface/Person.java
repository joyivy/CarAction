package Day34_abstractionInterface;

import Day34_abstractionInterface.animalTask.Playable;
import Day34_abstractionInterface.animalTask.Swimmable;

public class Person implements Swimmable, Playable {
    @Override
    public void play() {

    }

    @Override
    public void swim() {

    }
}
