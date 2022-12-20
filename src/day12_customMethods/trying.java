package day12_customMethods;

import java.util.Scanner;

public class trying {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How much you make per hour?");
        double hourlyRate = input.nextDouble();

        System.out.println("How many hours you work in week?");
        int weeklyHours = input.nextInt();
        salary(hourlyRate,weeklyHours);

    }

    public static void salary(double hourlyRate,int weeklyHours){


        System.out.println("you make $"+ hourlyRate+ " per hour");
        System.out.println("you make $"+ weeklyHours+ " per hour");
        System.out.println("your  gross income is "+ (hourlyRate*weeklyHours*52));


    }
}

