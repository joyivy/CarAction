package day13_customMethods;

public class WarmUpTest {
    public static void main(String[] args) {


        calculate(200, 5, '/');

        ageGroup (15);

        eligibleToVote( 45, true);
    }

    public static void calculate(double num1, double num2, char mathOperator) {

        double result = 0;

        switch (mathOperator) {
            case '+':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println((num1 + " " + mathOperator + " " + num2 + " = " + (num1 - num2)));
                break;
            case '*':
                System.out.println((num1 + " " + mathOperator + " " + num2 + " = " + (num1 * num2)));
                break;
            case '/':
                System.out.println((num1 + " " + mathOperator + " " + num2 + " = " + (num1 / num2)));
                break;
            default:
                System.err.println("Invalid operator: " + mathOperator);
        }
    }


    public static void ageGroup(int age) {

        if (age >= 0 && age <= 150) {
            System.out.println(   (age <21)? "Teeneger" : (age <55)? "Adult" : "Senior"    );

        }else{
            System.err.println("Invalid age" + age);
        }


    }



    public static void eligibleToVote (int age , boolean isAmerican){

        if( age >= 18 && isAmerican){
            System.out.println("You are eligible to vote");
        }else{
            System.err.println("You are not eligible to vote");
        }
    }
}
/*
/*
1. Create a method named calculate that can take three arguments:
            num1 (double)
            num2 (double)
            mathOperator (char)
	    The method should display the calculation result of those two numbers as long as the 3rd argument is a valid math operator, otherwise the method prints "Invalid Operator"
	        Ex:
	            calculate(10, 20, '+')
	        output:
	            10 + 20 = 30
	2. Create a method named ageGroup that can print the age group of the person
	        age groups are:
	                Teenager (< 21)
	                Adult   (>=21 && <55 )
	                Senior  ( > 55 )
    3. Create a method named eligibleToVote that takes two arguments:
	        1. age (int)
	        2. isAmerican (boolean)
	    Then the method should determine if the person eligible to vote
	        Ex:
	            eligibleToVote(23, true)
	        output:
	            You are eligible to vote
 */
