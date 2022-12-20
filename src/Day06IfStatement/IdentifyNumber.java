package Day06IfStatement;

public class IdentifyNumber {

    public static void main(String[] args) {

        int number = -20;

        boolean isPositive = number > 0; //If the numnber greater than zero it is positive number
        boolean isNegative =  number < 0; // if the number is less than zero it is negative number
       // boolean isZero   = number == 0; // if the number equal is zero it is mean number is zero

       boolean iszero = !isPositive && !isNegative;

        System.out.println(number + " is positive number " + isPositive);
        System.out.println( number + " is negative Number "+ isNegative);
        System.out.println( number + " is zero " + iszero);


        System.out.println("===========================================");

        int num = 100;
        if(num > 0) {
            System.out.println(num + " is positive number");
        }

        if ( num< 0) {
            System.out.println(num + " is negative number  ");
        }
        }







    }

/*
2. Create a class named IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.
			Ex:
				number = 200
			output:
		        200 is positive number: true
		        200 is negative number: false
		        200 is zero: false
 */
