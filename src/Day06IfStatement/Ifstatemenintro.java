package Day06IfStatement;

public class Ifstatemenintro {

    public static void main(String[] args) {

        int number = 0;
        boolean isPositive = number > 0;
        boolean isnegative = number < 0;
        boolean isZero = number == 0;

        if ( isPositive){
            System.out.println( number + " is positive");
        }
        if ( isnegative){
        System.out.println( number + " is negative");
        }

        if (isZero){
            System.out.println(number + " is number zero"); }

    }
}
