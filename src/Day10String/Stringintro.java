package Day10String;
import java.util.Scanner;


public class Stringintro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str= "Java";
        System.out.println(str);


        String s1 ="Cat";
        String s2 =" Dog";

        String s3 ="Cat";
        String s4 = "Cat";

        System.out.println(s1==s4);

        System.out.println("+++++++++++++++++++++++");

        String strl1 =new String("Java"); // Creates two objects 1. String pool 2. in heep
        String strl2 = new String("Java");
        System.out.println(strl1 == strl2);

        System.out.println("=======================");

        String t1 = "Python";
        String t2 =new String("Python");
        String t3 = new String("Python");
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t1==t2);
        System.out.println(t3==t2);



    }
}
