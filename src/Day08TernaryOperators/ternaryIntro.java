package Day08TernaryOperators;

import javax.swing.*;

public class ternaryIntro {
    public static void main(String[] args) {
        int score = 85;
        String result ="";


        if (score >=60){
            result ="Passed";
        }else {
            result ="Failed";
        }
        System.out.println(result);

        System.out.println("++++++++++++++++++++++");

        String result2  = (score >= 60) ? "Passed" : "Failed";
        System.out.println(result2);
        System.out.println("+++++++++++");

        int age =34;
        String R = "";
        if (age >=21){
            R ="Elegible";
        }else {
            R = "Not Eligible";
        }
        System.out.println(R);
        System.out.println("+++++++++++++++++");
        String R2 =(age>=21) ? "Eligible" : "Not Eligible";
        System.out.println(R2);
    }

}
