package day12_customMethods;

import java.util.Scanner;

public class formatFullName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name= ");
        String first = input.next();

        System.out.println("Enter your last name= ");
        String last = input.next();



       first= first.substring(0, 1).toUpperCase() +first.substring(1);
        // getting first character of first name

        last= last.substring(0, 1).toUpperCase() +last.substring(1).toLowerCase();

        System.out.println(first);
        System.out.println(last);

        String fullname = first + " " +last;
        System.out.println(fullname);


input.close();


    }
}
/*
1. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)
	                    input:
	                        firstName = "cyDEo"
	                        lastName = "SCHOOL";
	                    output:
	                        Cydeo School

 */