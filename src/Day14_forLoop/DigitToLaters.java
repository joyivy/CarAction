package Day14_forLoop;
import java.util.Scanner;

public class DigitToLaters {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter:");

        String str = input.next();

        String letters = "";
        String digits = "";
        String specialChars = "";

        for (int i = 0; i < str.length(); i++) {
            if ('0' <= str.charAt(i) && str.charAt(i) <= '9') {
                digits += str.charAt(i);
            } else if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z' || 'a' <= str.charAt(i) && str.charAt(i) <= 'z') {
                letters += str.charAt(i);
            } else {
                specialChars += str.charAt(i);
            }
        }
        System.out.println("letters: " + letters);
        System.out.println("digits: " + digits);
        System.out.println("special characters: " + specialChars);

    }
}

