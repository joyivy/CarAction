package Day14_forLoop;

public class palindrome {
    public static void main(String[] args) {
        String name =" Joy Ivy";
        String reverse = "";
        for (int i = name.length()-1; i >= 0; i--) {
            reverse += name.charAt(i);
        }
        boolean isPalindrome = name.equalsIgnoreCase(reverse);
        System.out.println(isPalindrome );

    }
}
