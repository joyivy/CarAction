package Day07IFMultiBranch;

public class GradeLevel {
    public static void main(String[] args) {
        int gradelevel = 6; // between 1-18
        String result = "";
        if (gradelevel <= 5){
            result = " Elementary School";
        }else if( gradelevel <= 8) {
         result = " Middle Scholl";
        }else if( gradelevel <= 12 ) {
            result = " High school";
        }else if( gradelevel <= 16) {
            result = " College";
        }else {
            result = "Grad School";
        }
        System.out.println(result);
    }
    }

/*
1. Create a class named GradeLevel.java
2. An integer variable named gradeLevel is declared and given, Write a
program to determine and print which school type someone is in.

Ex:

gradeLevel = 2

output:

Elementary School
The grade level and types are:
1 ~ 5: Elementary school
6 ~ 8: Middle school
9 ~ 12: High school
13 ~ 16: College
17 ~ 18: Grad School

Note: Assume that the given number is between 1 ~ 18
 */