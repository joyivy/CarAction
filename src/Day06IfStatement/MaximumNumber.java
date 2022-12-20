package Day06IfStatement;

public class MaximumNumber {
    public static void main(String[] args) {

        int nm1 = 1000,
         nm2 = 100;
        if(nm1 > nm2){
            System.out.println(nm1 + " is the Maximum Number");
        }
        if(nm2 > nm1){
            System.out.println( nm2 + " is the maximim number");
        }
        if( nm1 == nm2){
            System.out.println( " Equal");
        }
    }
}
/*
1. Create a class named MaximumNumber.java
2. Declare the following variables:

1. num1
2. num2

3. Write a program that can print the maximum number between the
two numbers above, if both are equal then print Equal

Ex:

num1 = 10
num2 = 20

output:
20 is the maximum number
 */