package day27_AccessModifiers;

public class Cydeostudent {

    public String name;
    public int  age;
    public char gender;

    public static String schoolName;
    public static String secretCode;

    public Cydeostudent(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    static{
        schoolName ="Cydeo School";
        secretCode = " Woodeen Spoon";
    }

    @Override
    public String toString() {
        return "Cydeostudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
