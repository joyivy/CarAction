package Day15LoopContiniu;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);

        int max = -2147483648; //Any integer number that user enter will ALWAYS be greater than -2147483648


        for (int i = 0; i < 5 ; i++) {




            System.out.println("Enter Number");
            int num = input.nextInt(); // 10, 5, 3 20 15
            if (num>max) { // if the user entered entry is greater than the current maximum number that we have
                max = num; // then user entered number should be the maximum number
            }

        }
        System.out.println("Maximum number =" + max);
        input.close();
    }
}

