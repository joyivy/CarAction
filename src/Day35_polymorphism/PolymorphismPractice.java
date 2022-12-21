package Day35_polymorphism;

import Day34_abstractionInterface.animalTask.Animal;
import Day34_abstractionInterface.animalTask.Tiger;

public class PolymorphismPractice {
    public static void main(String[] args) {
      Animal tiger = new Tiger("Sher Khan", "Bengal", 'M', 5, "Large", "Orange");
        tiger.eat();
        tiger.drink();
        tiger.sleep();
       // tiger.hunt();
    }
}
