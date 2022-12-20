package day16_NestedLoop;

public class doWhileLoop {
    public static void main(String[] args) {

        boolean conditaion = false;
        for (; conditaion; ) {
            System.out.println("hello Cydeo ===== For Loop");
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++++");

        while (conditaion) {
            System.out.println("Hello Cydeo ===============  While Loop");
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        do {
            System.out.println("Hello Cydeo ++++++++++++++++ Do while ");
        }while (conditaion);


    }
}