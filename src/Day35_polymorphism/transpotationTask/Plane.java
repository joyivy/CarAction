package Day35_polymorphism.transpotationTask;

public abstract class Plane extends Transportation{
    public Plane(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }
}
