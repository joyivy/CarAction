package Day34_abstractionInterface.animalTask;

public class Eagle extends Animal implements Flyable, WildAnimal{
    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " "+ "Eating snake.");

    }

    @Override
    public void fly() {
        System.out.println(getName()+" " +" Fly on America.");
    }

    @Override
    public void hunt() {

    }
}
