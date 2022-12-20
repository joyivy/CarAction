package Day29_inhertitance.animalTask;

public class Zoo{
    public static void main(String[] args) {
        Dog dog= new Dog();
        dog.setInfo("Max","Husky", 'M', 4,"Large","White");
dog.eat();
dog.sleep();
dog.drink();
        Cat cat = new Cat();
        cat.setInfo("Fatima", "Smokin", 'F', 4, "Small", "White and Black");
cat.sleep();
cat.drink();
cat.eat();
        Tiger tiger= new Tiger();
        tiger.setInfo("Shar Khan","Bengal", 'M',6,"Large","Orange");
tiger.drink();
tiger.eat();
tiger.sleep();
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);

        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
dog.bark();
cat.meow();
cat.scratch();
tiger.hunt();
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");


    }
}
