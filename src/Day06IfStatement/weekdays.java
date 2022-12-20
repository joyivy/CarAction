package Day06IfStatement;

public class weekdays {

    public static void main(String[] args) {
        int no = 1;
        boolean day1= no == 1; // if the month number is 2 ( feb) then it has 28 days
        boolean dayno1 = no ==2 || no == 3 || no == 4 || no==5 || no==6 || no==7;

        if ( no == 1){
            System.out.println( " Monday");
        }


    }
}
/*
1. Create a class named WeekDays.java
2. An integer variable named number is declared and given, Write a
program that can print the name of the day that the number represents

Ex:
Given:
number = 1

output:
Monday

Hint: Assume that a number between 1 ~ 7 is given to the variable
 */