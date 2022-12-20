package Day14_forLoop;

public class MethodOverloadingPractice {
    public static void main(String[] args) {

        System.out.println( sum(10,20,70));
        System.out.println(sum(20,20,98,28));
        System.out.println(sum(6.0 , 8.0));
        System.out.println(sum(10.5, 26.0, 90.5, 10.7));
        System.out.println(sum(10, 20.5));

    }

    public static int sum (int num1, int num2){
        return num1+ num2;
    }
    public static int sum (int num1, int num2, int num3){
        return sum(num1,num2) +num3;
    }
    public static int sum( int num1, int num2, int num3, int num4){
        return sum(num1, num2, num3) +num4;
    }
    public static double sum (double num1, double num2){
        return num1+num2;
    }

    public static double sum ( double num1, double num2, double num3){
        return sum(num1, num2)+num3;
    }
    public static double sum( double num1, double num2, double num3, double num4){
        return sum ( num1 ,num2 , num3) +num4;

    }
    }

