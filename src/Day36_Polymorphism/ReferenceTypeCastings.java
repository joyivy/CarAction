package Day36_Polymorphism;

import Day29_inhertitance.animalTask.Animal;
import Day29_inhertitance.animalTask.Cat;
import Day29_inhertitance.animalTask.Dog;
import Day33_abstraction.EmployeeTask.Developer;
import Day33_abstraction.EmployeeTask.Driver;
import Day33_abstraction.EmployeeTask.Employee;
import Day33_abstraction.EmployeeTask.Tester;
import day30_inheritance.phoneTask.Nokia;
import day30_inheritance.phoneTask.Phone;

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
        System.out.println("-------------------------------------------------------------");

        Phone phone = new Nokia("XR20", "Small", "Blue", 350);

       phone.call(911);
        phone.text(123456);
        ((Nokia) phone).selfDefense();
        System.out.println("-------------------------------------------------------------");
        Employee employee = new Developer("Lucy", 30, 'F', "C1", "Java Developer", 95000, "Java");

        employee.work();

        System.out.println(((Developer) employee).getProgrammingLanguage());

        // Tester tester = (Tester)employee;

         Driver driver = (Driver) employee;




        //    ( (IPhone)phone ).faceTime(123456); // Nokia can not be converted to Iphone, because there is not "IS A" relationship between Nokia and Iphone


    }


}
