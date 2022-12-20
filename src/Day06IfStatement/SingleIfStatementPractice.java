package Day06IfStatement;

public class SingleIfStatementPractice {

    public static void main(String[] args) {
        int number = 100;
        boolean iseven = number % 2 == 0;
        if(iseven) {
            System.out.println("Even Number");
        }
        if(!iseven) {
            System.out.println("Odd Number");


            System.out.println("==========================");
            if(number % 2== 0){
                System.out.println("Even Number");
            }

            if(number % 2 != 0){
                System.out.println("Odd Number");
            }
        }
        }


    }

