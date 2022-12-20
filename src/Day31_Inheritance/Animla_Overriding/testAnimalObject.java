package Day31_Inheritance.Animla_Overriding;

public class testAnimalObject {

    public static void main(String[] args) {
        Cat cat= new Cat("Rasid","black cat", 'M', 4,"Small", "Black");
        Dog dog = new Dog("Seri", "Golden", 'F', 11, "Midium", "Gold");
        Lion lion = new Lion("Simba", "African Lion", 'M', 5, "Large", "Yellow",true);
        Eagle eagle= new Eagle("Bella", "American Eagle", 'F', 4,"Medium", "Black and White");

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(lion);
        System.out.println(eagle);

        System.out.println("-------------------------------------------------------------------------------------------------");

        cat.eat();
        dog.eat();
        lion.eat();
        eagle.eat();

        System.out.println("-------------------------------------------------------------------------------------------------");

        cat.slepp();
        dog.slepp();
        lion.slepp();
        eagle.slepp();


    }
}
