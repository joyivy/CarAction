package Day34_abstractionInterface.animalTask;

public class Parrot extends Animal implements Playable, Flyable{

    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " "+ "Eating cekirdek.");

    }

    @Override
    public void play() {

    }

    @Override
    public void fly() {
        System.out.println(getName() +" "+ " Flaying Amozon Forest.");
    }
}
