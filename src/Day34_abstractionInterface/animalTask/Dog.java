package Day34_abstractionInterface.animalTask;

public class Dog extends Animal implements Playable,Swimmable{
    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Dog"+ getName()+ " "+ "is eating dog food.");

    }

    @Override
    public void play() {
        System.out.println(getName()+" "  +"playing squuze toys.");
    }

    @Override
    public void swim() {

    }
}
