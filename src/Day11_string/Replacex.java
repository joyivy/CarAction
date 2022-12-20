package Day11_string;

public class Replacex {
    public static void main(String[] args) {
        String world3 = "xcodex";
        world3= world3.replaceAll("x" ,"a");


        System.out.println(world3.equalsIgnoreCase(world3));
        System.out.println(world3);
    }
}
/*

3. Create a class named ReplaceX, and write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
 */