package day16_NestedLoop;

public class Shape {
    public static void main(String[] args) {



/*
Use a nested loop to print the following shape

        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
        * * * * * * * *
        * * * * * * * * *
        * * * * * * * * * *
 */



            for (int i = 1; i < 10; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*  ");
                }
                System.out.println();

        }
    }
    }
