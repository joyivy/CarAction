package day27_AccessModifiers;

public class TestNestedClassObjects {

    public static void main(String[] args) {

        Car obj1 = new Car(); //car object
        Car.CarEngine obj2 = obj1.new CarEngine();//CarEngine Object

        new Car.StaticInnerClass();
        Car.StaticInnerClass obj3 = new Car.StaticInnerClass();
    }
}
