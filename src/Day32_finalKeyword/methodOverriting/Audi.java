package Day32_finalKeyword.methodOverriting;

public class Audi extends Car{

    public Audi(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Press the start botton to start. "+ getModel());
    }
}
