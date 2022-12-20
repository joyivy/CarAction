package Day10String;

import java.util.Scanner;

public class ShippingAdress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name:" );
        String fullname =input.nextLine();

        System.out.println("Enter your building number: " );
        String buildingNumber=input.next();

        input.nextLine();
        System.out.println("Enter your Street name: ");
        String streetname = input.nextLine();

        System.out.println("Enter your city name: ");
        String cityName = input.nextLine();

        System.out.println("Enter your state name : ");
        String statename = input.nextLine();

        System.out.println("Enter your zipcode : ");
        String zipCode = input.next();





        System.out.println("fullname =" + fullname);
        System.out.println("buildingnumber= " + buildingNumber);
        System.out.println("streetname = " + streetname);
        System.out.println("cityname= " + cityName);
        System.out.println("statename= " + statename);
        System.out.println("zipcode: " + zipCode);
        /// ===================================


        System.out.println("Your shipping adres is:");
        System.out.println("\t"+ fullname);
        System.out.println("\t"+ buildingNumber+" " + streetname);
        System.out.println("\t" + cityName + ", " + statename+ " "+ zipCode);

        input.close();
    }
}
/*
1. Create a class named ShippingAddress and ask the user to:
	        1.1 Enter your full name ( nextLine() )
	        1.2 Enter your building number ( next() )
	        1.3 Enter your Street name ( nextLine() )
	        1.4 Enter your city name ( nextLine() )
	        1.5 Enter your state ( nextLine() )
	        1.6 Enter your zip code ( next() )
	        1.7 Display the shipping address
	                Ex:
	                    Your shipping address is:
	                        John Smith
	                        7925 Jones Branch Dr
	                        McLean, VA 22012
 */