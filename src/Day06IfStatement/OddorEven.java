package Day06IfStatement;

import org.w3c.dom.ls.LSOutput;

public class OddorEven {

    public static void main(String[] args) {

  int number = 45;
  boolean isEven = number % 2==0; // when we divide a number by 2, if reminder is 0, mean the number is even.

 // boolean isOdd = number % 2 !0; when we divide o number by 2, if reminder is not zore, mean number is odd

        boolean isOdd =!isEven; // if number is not even, than it's odd

        System.out.println( number + " is even number " + isEven);
        System.out.println( number + " is an odd number " + isOdd);


    }
}
/*

 */
