package day13_customMethods;

public class returnStatement {

    public static void main(String[] args) {
        eligible(25);


    }

    public static void eligible(int age) {

        if (age < 0 || age > 150) {
            System.err.println("invalid age" + age);
            return; // exit the method
            // if the age invalid, than the this gets termineted
        }
        if (age >= 21) {
            System.out.println("You are eligible to buy alcohol");
        } else {
            System.out.println("You are not eligible to buy alcohol");
        }
    }

    public static int multiplacation(int n1, int n2) {

        int result = n1 * n2;

        return result;
    }




}
