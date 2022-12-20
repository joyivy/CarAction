package Day07IFMultiBranch;

public class AgeGroup {
    public static void main(String[] args) {
        int age = 35;
        String grup = "";


        if (age >= 1 && age <= 150) {
            if (age <= 21) {
                grup = "Teenager";
            } else if (age > 21 && age <= 55) {
                grup = " Adult";
            } else if (age >= 55) {
                grup = "Senior";
            } else {
                System.out.println("Invalid");
            }
            System.out.println(grup);

        }
    }
        }
/*
5. Create a class called AgeGroups, write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )

             if age is negative or greater than 150, print invalid

             NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */