package Day31_Inheritance.vehicletask;

public class AirPlane extends Vehicle {
    public AirPlane(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    public void fly(){

        System.out.println(getModel()+ " "+ getBrand()+ "flying");
    }
}
