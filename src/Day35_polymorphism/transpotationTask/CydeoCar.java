package Day35_polymorphism.transpotationTask;

import Day34_abstractionInterface.animalTask.Flyable;
import Day34_abstractionInterface.animalTask.Swimmable;

public class CydeoCar extends Car implements Flyable, Electric,AutoPilot, Swimmable {
    public CydeoCar(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void autoPark() {

    }

    @Override
    public void selfdrive() {

    }

    @Override
    public void charge() {

    }

    @Override
    public void tranportPeople() {

    }
}
