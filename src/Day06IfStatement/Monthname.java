package Day06IfStatement;

public class Monthname {
    public static void main(String[] args) {
        int month = 10;
        boolean M = month == 10 ;
        boolean Sep = month == 1 || month == 2|| month == 3 || month == 4 || month == 5 || month == 6 || month == 7 || month == 8 || month == 9 || month == 11 || month == 12;

        if ( month == 10){
            System.out.println( " September");

        }
    }
}
/*
1. Create a class named MonthName.java
2. An integer variable named number is declared and given, Write a
program that can print the name of the month that the number
represents

Ex:
Given:
number = 10

output:
Octoseptember
 */