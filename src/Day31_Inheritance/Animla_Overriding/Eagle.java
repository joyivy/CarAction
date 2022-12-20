package Day31_Inheritance.Animla_Overriding;

public class Eagle extends  Animal{
    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Eagle "+ getName() + " is eating snake.");
    }

    @Override
    public void slepp() {
        System.out.println("Eagla "+ getName()+ " is sleaping on the tree. ");
    }
}
