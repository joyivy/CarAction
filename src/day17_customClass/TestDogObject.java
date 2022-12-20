package day17_customClass;

public class TestDogObject {
    public static void main(String[] args) {

      Dog dog1 = new Dog();
      dog1.name = "Max";
      dog1.breed ="Husky";
      dog1.gender ='M';
      dog1.age = 4;
      dog1.size = "Large";
      dog1.color ="Grey";

      Dog dog2 =new Dog();

      dog2.name ="Bella";
      dog2.breed = "Golden Retriver";
      dog2.gender = 'F';
      dog2.size = "M";
      dog2.age = 4;
      dog2.color = "Golden";

      Dog dog3= new Dog();
      dog3.setInfo("Loki", "Chow Chow", 'F', 4, "Small", "Brown");

      Dog dog4 =new Dog();
      dog4.setInfo("Seri", "golden retwiriewe", 'F', 13, "Midium", "Gold");


        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);

        dog3.eat();
        dog2.drink();



    }
}
