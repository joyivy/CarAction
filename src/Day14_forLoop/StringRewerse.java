package Day14_forLoop;

public class StringRewerse {
    public static void main(String[] args) {
        String str = "Cydeo Scholl";

        String name = "kjdnqkjndkjsnc kldjsaijdosijd lishjdoisjd;ow";
        String result = reverse(name);
        System.out.println(result);


        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println(reverse);


    }

    public static String reverse(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);

        }
        return reverse ;
    }
}