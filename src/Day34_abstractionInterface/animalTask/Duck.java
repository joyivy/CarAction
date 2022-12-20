package Day34_abstractionInterface.animalTask;

public class Duck extends Animal implements Playable,Flyable,Swimmable{
    public Duck(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " "+ " is eating worm.");

    }

    @Override
    public void play() {

    }

    @Override
    public void fly() {
        System.out.println(getName() + " "+ " Can fly on Lake.");
    }

    @Override
    public void swim() {

    }
}
