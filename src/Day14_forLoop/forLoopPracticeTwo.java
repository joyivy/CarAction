package Day14_forLoop;

import java.util.Scanner;

public class forLoopPracticeTwo {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int sum= 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter a number");
            sum  += input.nextInt();

        }
        System.out.println("sum = " +sum);





    }
}
