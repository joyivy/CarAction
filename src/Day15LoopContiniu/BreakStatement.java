package Day15LoopContiniu;

public class BreakStatement {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 6) { // if i's value reach 6
                break; //exits the loop
            }
            System.out.println(i);

        }
        System.out.println("..............................................");

        for (char i = 'A'; i <= 'Z'; i++) {

            if (i == 'J') {
                System.out.println("Loop is terminated");
                break;
                // System.out.println("Loop is terminated");
            }

            System.out.println(i);

        }
        System.out.println("--------------------------------");
        for (;;){
        System.out.println("hello");
        break;
}

    }
}
