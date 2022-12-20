package Day11_string;

public class Startwithx {
    public static void main(String[] args) {


        String world2 = "xcodex";

       world2= world2.replaceFirst("x", "a");

        System.out.println(world2);
    }
}
/*
2. Create a class named StartsWithX and write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */