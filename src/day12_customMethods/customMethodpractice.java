package day12_customMethods;

public class customMethodpractice {
    public static void main(String[] args) {

maxNum(10000, 5000);
        System.out.println("???????????????????????????");
        maxNum(15000, 160000);
        System.out.println("????????????????");
        maxNum( -200 , -20);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");
        initial("Cydeo", "School");

        initial("Joy" , "Ivy");

        initial("Denis", "Ferhatovic");

        System.out.println("?????????????????????????????");
initial("Java", "Programming");
    }


    //create a method that can print the maximum number between two numbers, if both are equal then it prints "Equal", (num1, num2)
    public static void maxNum(double num1, double num2){
        if (num1 > num2){
            System.out.println(num1 +" is the maximum number");
        }else if ( num2 > num1){
            System.out.println(num2 + " is the maximum number");
        }else{
            System.out.println("Equal");
        }

    }

    //Create a method that can display the initials of a person  (firstName, lastName)
    public static void initial(String firstname, String lastname){
        String initial = firstname.charAt(0)+ "." + lastname.charAt(0);
        System.out.println( "initial is= " + initial);

    }

}