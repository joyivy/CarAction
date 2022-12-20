package Day14_forLoop;

public class ForLoopPractice {
    public static void main(String[] args) {
        for (int i = 10; i >= 5; i--) {
            System.out.println("Hello Cydeo" + i);
        }
        System.out.println("_______________________________");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {

            sum += i;
        }
        System.out.println(sum);
        System.out.println("................................");

        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Hello World");

        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::");

        for (char i = 'Z'; i>='A'; i--){
            System.out.print(i + " ");

        }


    }
}