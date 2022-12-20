package day12_customMethods;
import java.util.Scanner;
public class salarycalculater {

        public static void main(String[] args) {

            double hourlyRate;
            int weeklyHours;

            System.out.println("Please first provide your hourly rate and then your weekly hours:");
            salary(hourlyRate = new Scanner(System.in).nextDouble(), weeklyHours = new Scanner(System.in).nextInt());

        }

        public static void salary(double hourlyRate, int weeklyHours) {
            double salary = hourlyRate * weeklyHours * 52;
            System.out.println("You make $" +hourlyRate+ " per hour." );
            System.out.println("You work " +weeklyHours+ " hours in a week.");
            System.out.println("Your gross income is $" + salary);

        }
    }
