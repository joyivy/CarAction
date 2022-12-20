package Day06IfStatement;

public class OperatorPrecedence {

    public static void main(String[] args) {

        System.out.println( 5+2 * 3);
        //                  5 + 6 carpma islemi once olur 2*3+5 =11

        System.out.println(7 + 3 - 2 / 2 );
        //                 7+3 - 1 ===> 9

        System.out.println(-5 + 3);
        //                 -2

        System.out.println( 10 > 9 == 8 < 7 && " java" =="Python" || 'a' == 'A');
        //                  true ==   false && "Java" == "Python" || 'a' == 'A'
        //                     false         &&  False            ||    false
        //                                 false   || false
        //                                        FALSE
        System.out.println( 100 >= 20 && 40 * 2 > 60);
        //                  100 >= 20 && 80 > 60
        //                    true && true
        //                         true

        int a = 20;
        a += 10 + 2 * 3;
        // a+= 10 + 6
        // a+= 16
        // a = 36



    }
}
