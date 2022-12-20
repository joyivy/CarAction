package day25_Constructor;

import day17_customClass.Dog;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethodPractice {

    public static void main(String[] args) {

        Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
        dogs[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
        dogs[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
        dogs[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
        dogs[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
        dogs[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");


        ArrayList<Dog> smallDogs = new ArrayList<>(Arrays.asList(dogs));

        smallDogs.removeIf(p -> !p.size.equalsIgnoreCase("Small"));





        /*
        for (Dog dog : dogs) {
            if(dog.size.equalsIgnoreCase("Small")){
                smallDogs.add(dog);
            }
        }
*/

        System.out.println(smallDogs);

        ArrayList<Dog> younglDogs = new ArrayList<>(Arrays.asList(dogs));
        younglDogs.removeIf(p->p.age>4);
        System.out.println(younglDogs);

        ArrayList<Dog> FameleDogs = new ArrayList<>(Arrays.asList(dogs));
        younglDogs.removeIf(p->p.gender=='M');
        System.out.println(FameleDogs);

        ArrayList<Dog> meleDogs = new ArrayList<>(Arrays.asList(dogs));
        younglDogs.removeIf(p->p.gender=='F');
        System.out.println(meleDogs);

        System.out.println("?????????????????????????????????????????????????????????????????????");

        Dog[] dogs2 = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs2[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
        dogs2[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
        dogs2[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
        dogs2[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
        dogs2[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
        dogs2[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");


        ArrayList<Dog> list = new ArrayList<>( Arrays.asList(dogs2) );
        list.removeIf(p -> p.size.equalsIgnoreCase("small"));

        dogs2 = list.toArray(new Dog[list.size()]);

        System.out.println(Arrays.toString(dogs2));

    }
}