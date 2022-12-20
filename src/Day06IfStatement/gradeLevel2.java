package Day06IfStatement;

public class gradeLevel2 {

    public static void main(String[] args) {
        int gradeLevel = 16;

        String result = ""; // temporary value

        if( gradeLevel >= 1 && gradeLevel <= 5){
            result = "Elementry school";
        }
        if (gradeLevel >= 6 && gradeLevel <= 8 ){
            result = " Middle Scholl";
        }
        if (gradeLevel >= 9 && gradeLevel <= 12 ){
           result = " High Scholl";
        }
        if (gradeLevel >= 13 && gradeLevel <=16){
           result = " Colloge";
        }
        if (gradeLevel >= 17 && gradeLevel <= 18){
           result = "grad scholol ";
        }
        System.out.println(result);
    }

    }


/*
1. Create a class named GradeLevel.java
2. An integer variable named gradeLevel is declared and given, Write
a program to determine and print which school type someone is in

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

Assume that the given number is 1 ~ 18
 */
