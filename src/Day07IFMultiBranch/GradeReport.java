package Day07IFMultiBranch;

public class GradeReport {
    public static void main(String[] args) {
        int score = 85;
        String result = "";
        if (score >= 90) { //false means score is less than 90
            result += "You Grade is A";
        } else if (score >= 80 && score < 90){ //
            result += "You Grade is B" ;
        }else if ( score >+ 70 && score < 80){
            result += "You Grade is C";
        }else if ( score>= 60 && score <70){
            result = " You Grade is D";
        }else{
            result = "You Grade is F ";
        }
        System.out.println(result);
    }
}
/*
1. Create a class named GradeReport.java
2. An integer variable named score is declared and given, Write a
program that can print the grade of the student

Ex:

score = 95

output:
Your grade is A

Note: Assume that the given score is between 0 ~ 100
 */