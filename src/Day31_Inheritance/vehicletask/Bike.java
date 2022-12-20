package Day31_Inheritance.vehicletask;

public class Bike extends Vehicle {

    public Bike(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    public void driving(){
        System.out.println("Biking" + getBrand()+ " "+ getModel());
    }
}
