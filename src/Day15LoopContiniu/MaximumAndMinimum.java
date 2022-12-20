package Day15LoopContiniu;

import java.util.Scanner;

public class MaximumAndMinimum {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int max = -2147483648; // any number entering always biger than this number
        int min = 2147483647; //any number entering always less than this number

        for (int i = 0; i <5 ; i++) {
            System.out.println("enter Number");
            int num = input.nextInt();

            if (num > max){
                max = num;
            }
            if (num<min){
                min =num;
            }

        }
        System.out.println(" maximum number =" +max);
        System.out.println("minumum number = " + min);
    }
}
