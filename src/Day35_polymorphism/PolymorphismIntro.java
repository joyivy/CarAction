package Day35_polymorphism;


import Day31_Inheritance.shape_methodOverriding.Circle;
import Day32_finalKeyword.methodOverriting.Audi;
import Day32_finalKeyword.methodOverriting.Honda;
import Day32_finalKeyword.methodOverriting.Tesla;
import Day33_abstraction.EmployeeTask.Developer;
import Day33_abstraction.EmployeeTask.Driver;
import Day33_abstraction.EmployeeTask.Tester;
import Day34_abstractionInterface.animalTask.*;

import java.util.Arrays;

public class PolymorphismIntro {

    public static void main(String[] args) {

        Dog dog = new Dog("Max", "Husky", 'M', 4, "Small", "White");

        Cat cat = new Cat("Max", "Husky", 'M', 4, "Small", "White");

        Tiger tiger = null;

        Eagle eagle = null;

        Lion lion = null;

        Parrot parrot = null;

        Dolphin dolphin = null;

        Shark shark = null;

        Duck duck = null;


        Animal[] animals = {dog, cat, tiger, lion, eagle, parrot, dolphin, shark, duck};

        /// Animal animal = new Tesla("Model Y", "Blue", 2022, 60000);
        // there is not "IS A" relationship between Animal and Tesla

        Animal animal = new Dog("Max", "Husky", 'M', 4, "Small", "White");
        animal.eat();
        animal.drink();
        animal.sleep();

        //  animal.play();
        //  animal.bark();


        System.out.println("---------------------------------------------------");

        String str ="Java";
        Integer n= 100;
        Boolean r =false;
        Double d = 10.5;
        Circle circle = new Circle(4);

        Honda honda = new Honda("Pilot", "Black", 2019, 35000);

       Audi  audi = new Audi("Q6", "Silver", 2020, 36000);

       Tesla tesla = new Tesla("Model Y", "Blue", 2022, 60000);



        Developer developer = new Developer("Lucy", 30, 'F', "C1", "Java Developer", 95000, "Java");

        Driver driver = new Driver("Aaron", 48, 'M', "D1", "Truck Driver", 90000);

        Tester tester = new Tester("Emily", 35, 'F', "E1", "Manual Tester", 80000);


        Object[] objects = {str, n, r, d, circle, honda, audi, tesla, developer, driver, tester};
        System.out.println(Arrays.toString(objects));
    }
}