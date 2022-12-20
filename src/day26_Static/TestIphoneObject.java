package day26_Static;

import java.sql.SQLOutput;

public class TestIphoneObject {

    public static void main(String[] args) {
        Iphone iPhone = new Iphone("iPhone12", "Black", 10000);

        System.out.println(iPhone.model);
        System.out.println(iPhone.color);
        System.out.println(iPhone.price);

       /*iPhone.printIphoneInfo();
        System.out.println(iPhone.brand);
        System.out.println(iPhone.OS);
        iPhone.printOperatingSystem();/*

        */




        System.out.println(Iphone.brand);
        System.out.println(Iphone.OS);



    }
}
