package Day07IFMultiBranch;

public class ifstatementWithoutCurlybraces {
    public static void main(String[] args) {
        int age = 32;
        if (age >= 21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }
        System.out.println("++++++++++++++++++++++++++");
        if(age>+21) System.out.println("Eligible");
        else System.out.println("Not Eligible");
        System.out.println("=========================");

        int day = 2; // 1-7
         if ( day == 1) System.out.println("Monday");
         else if ( day==2) System.out.println("Tuesday");
         else if (day ==3) System.out.println("Wendsday");
         else if (day == 4) System.out.println("Thursday");
         else if ( day == 5) System.out.println("Friday");
         else if (day == 6) System.out.println(" Saturday");
         else System.out.println("Sunday");

         // if statemnet without the curly braces is not a good practice == GOOD TO KNOW.
    }
}
