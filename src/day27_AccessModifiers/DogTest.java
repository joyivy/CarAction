package day27_AccessModifiers;

public class DogTest {

    public static void main(String[] args) {


        Dog dog1 = new Dog("Golden", "Large", 'F', 12, "yellow");
        Dog dog2 = new Dog("Boleyn", "Small", 'M',35,"black");
        Dog dog3 = new Dog("Labrador" ,"Large", 'F', 9,"White");
        Dog dog4 = new Dog("Danua","Extra Large",'M',3,"Grey");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);

        System.out.println(dog1.numberOfEyes);
        System.out.println(dog2.numberOflegs);
        System.out.println(dog3.numberOfWings);
        System.out.println(dog4.isFriendly);

    }
}
