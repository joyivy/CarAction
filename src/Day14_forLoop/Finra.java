package Day14_forLoop;

import java.util.zip.ZipFile;

public class Finra {
    public static void main(String[] args) {
        String result = " ";
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println( "Finra");
            } else if ( i % 3== 0){
                System.out.println(" FIN");
            }else if ( i% 5 == 0){
                System.out.println("Ra");
            }else{
                System.out.println(i+ " ");
            }
        }
    }
}

/*
Write a method which prints out the numbers from 1 to 100 but for numbers which are a multiple
of both 3 and 5, print "FINRA" instead of the number,  for numbers which are a multiple of 3,
print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number.

    ex:
 */