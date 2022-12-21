package Day36_Polymorphism;

import Day29_inhertitance.animalTask.Animal;
import Day29_inhertitance.animalTask.Cat;
import Day29_inhertitance.animalTask.Dog;

public class ReferenceTypeCastings {
    public static void main(String[] args) {
        Dog dog = new Dog();
       // Cat cat = new Dog();

        Animal animal =(Animal) new Dog(); // implicit casting

        System.out.println("++++++++++++++++++++++++++++++++++++++");
        Animal animal1=new Dog();
        animal1.setInfo("Max","Husky", 'F', 25,"Midium","Brown");
        animal1.eat();
        animal1.drink();
        animal1.sleep();
        //((Dog)animal1).bark(); //one time use only
        //Dog dog1 = (Dog) animal1; //useing multiple times
        //dog1.bark();

        //  ( (Cat)animal1).scratch(); // Dog can not be converted to Cat, because there is not "IS A" relationship between dog and cat


    }


}
