package Day19_Array;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        int score1 =78;
        int score2 =88;
        int score3 =98;
        int score4 =48;
        int score5 =78;

        System.out.println("???????????????????????????");

        int[] scores = new int [5];
        scores[2]= 98;
        scores[0]=78;
        scores [1]= 88;
        scores [3]=48;
        scores [4]= 78;



        System.out.println(Arrays.toString(scores));
        System.out.println(scores[2]);

        for (int i = 0; i < scores.length ; i++) {
            System.out.println(scores[i]);

        }


    }
}

