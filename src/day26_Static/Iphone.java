package day26_Static;

public class Iphone {
    public static String brand = "Apple"; // static: "Apple" is the brand of all the iphone object.
    public String model; // instance : diffirent models for iphone objects
    public String color;
    public double price;
    public static String OS= "IOS";
    public static String madeIn = "China";
    public static boolean hasBattery = true;
    public static boolean isRouchScrean = true;
    public static boolean isExoensiveToFix= true;

    public Iphone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public void printIphoneInfo(){

        System.out.println("Brand"+ brand);
        System.out.println("Model" + model);
        System.out.println("Color" + color);
        System.out.println("Price"+ price);
    }

    public void printOperatingSystem (){
        System.out.println("Operating System" + OS);


    }



}



/*
brand, modekl .color, price .OS,madeIn, hasBattery, hasTouchScreen, isExoensiveToFix
 */