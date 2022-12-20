package Day31_Inheritance.Animla_Overriding;

public class Dog extends Animal {
    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Dog "+ getName()+ " is eating dog food.");
    }

    @Override
    public void slepp() {
        System.out.println("Dog"+ getName()+ " is sleeping mostly of day.");
    }

    public void bark(){
        System.out.println("Dog "+ getName()+ " is barking, i don't know why . ");
    }
}
