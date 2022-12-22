package Day37_Exceptions;

public class ExceptionsIntro {
    public static void main(String[] args) {
        String str = "Java";
       // char ch = str.charAt(250); // unhecked exceptions
        //System.out.println(ch);

        Pizza pizza= null;
       // pizza.calcCost();// unhecked exceptions

        System.out.println(50/0); // unhecked exceptions

        System.out.println("Hello World");



    }
}
