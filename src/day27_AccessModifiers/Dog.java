package day27_AccessModifiers;

public class Dog {

    public String bread;
    public String size;
    public char gender;
    public int age;
    public String color;

    public static int numberOflegs;
    public static int numberOfEyes;
    public static int numberOfWings;
    public static String isFriendly;

    public Dog(String bread, String size, char gender, int age, String color) {
        this.bread = bread;
        this.size = size;
        this.gender = gender;
        this.age = age;
        this.color = color;
    }
    static{
        numberOflegs=4;
        numberOfEyes=2;
        numberOfWings=0;
        isFriendly= "Yes";
    }

    @Override
    public String toString() {
        return "Dog{" +
                "bread='" + bread + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}


/*
3.  Create a class called Dog
            Variables:
                breed, size, gender, age, color, numberOfLegs, numberOfEyes, numberOfWings, isFriendly

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                eat()
                drink()
                sleep()
                play()
                bark()
                toString()
 */