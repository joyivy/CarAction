package day13_customMethods;

public class ReturnMethodsPractice {
    public static void main(String[] args) {

        System.out.println(  isOdd(160) );
        System.out.println(max(180,550));

    }
    public static boolean isOdd(int num){
        return (num % 2 != 0)? true : false;
    }

    public static boolean IsEven (int num){
     return !isOdd(num);

    }


    public static int max(int n1, int n2) {
        //return n1>n2 ? n1: n2;

        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }
}
