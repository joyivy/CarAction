package Day15LoopContiniu;

public class ContinueStatments {

    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println(i);

        }
        System.out.println("{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{");

        for (int i = 10; i < 20; i++) {
            if (i % 2 == 0) { // if i is even
                continue; // skips the current iteration
            }
            System.out.println(i);


            System.out.println("+++======================+++");


        }
        for (int i = 50; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.print(i +" ");
            }
        }

        System.out.println();


        //50, 52, 54, 56 ...... 100
        for (int i = 50; i < 101; i += 2) {
            System.out.print(i+" ");
        }

        System.out.println();


        for (int i = 50; i < 101; i++) {
            if (i % 2 != 0){ // if the i's value is odd number
                continue; // skip it
            }

            System.out.print(i+" ");

        }

        System.out.println();

    }
}