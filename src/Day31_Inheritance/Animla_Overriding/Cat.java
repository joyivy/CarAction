package Day31_Inheritance.Animla_Overriding;

public class Cat extends Animal{
    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Cat" + getName()+ " is eating cat food.");
    }

    @Override
    public void slepp() {
        System.out.println("Cat " + getName()+ " sleeps 12 hour is a day");
    }
    public void scratch(){
        System.out.println("Cat " + getName() + " scratch everything");
    }
}
