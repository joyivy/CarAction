package Day11_string;

import java.util.Scanner;

public class emailtask {
//craig_federighi@apple.com

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your email:");
        String email = scan.next();
        scan.close();

        String firstName = email.substring(0, email.indexOf("_"));
        firstName = firstName.toUpperCase();
        String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Domain: " + domain);


    }
}
/*
String email = "craig_federighi@apple.com";
        String firstname = email.substring(0 ,1).toUpperCase();
        String lastname = email.substring(email.indexOf("_") +1, email.indexOf("@"));
        String rest = email.substring(email.indexOf("@"));
        System.out.println(firstname);

        System.out.println(lastname);
        System.out.println(rest);

 */