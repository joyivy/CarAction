package Day35_polymorphism.transpotationTask;

public class Tesla extends Car implements Electric,AutoPark,AutoPilot{
    public Tesla(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
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
