package Day37_Exceptions;

import java.io.FileInputStream;

public class ExceptionsIntro {
    public static void main(String[] args) {
        String str = "Java";
       // char ch = str.charAt(250); // unhecked exceptions
        //System.out.println(ch);

        Pizza pizza= null;
       // pizza.calcCost();// unhecked exceptions

       // System.out.println(50/0);  unhecked exceptions

        System.out.println("Hello World");

        System.out.println("============================================");


        int score = 100;

        if (score >59){
            System.out.println("your grade is D");
        }else if(score>70){
            System.out.println("Your grade is C");
        }
        System.out.println("__________________________________________________");

       // FileInputStream file = new FileInputStream(""); checked exceptions

        //Thread.sleep(3000);  checked exceptions.


    }
}
