package Day10String;

import java.util.Scanner;

public class EmployeInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter your full name ;");
        String fullname = input.nextLine();

        System.out.println("enter your age: ");
        byte age = input.nextByte();

        System.out.println( "Enter your gender: ");
        char gender = input.next().charAt(0);

        input.nextLine();

        System.out.println("Enter your company name: ");
        String companyname = input.nextLine();

        System.out.println(" Enter your job title");
        String jobtitle =input.nextLine();

        System.out.println("Enter your salary");
        double salary = input.nextDouble();


        System.out.println("fullname= " + fullname);
        System.out.println("age= "+ age);
        System.out.println("gender= " + gender);
        System.out.println("company name= "+ companyname);
        System.out.println("jobtitle" + jobtitle);
        System.out.println("salary= $" + salary);


input.close();


    }
}
/*
2. Create a class named EmployeeInfo and Ask the user to:
	        2.1 Enter your full name ( nextLine() )
	        2.2 Enter your age ( nextByte())
	        2.3 Enter your gender ( next().charAt(0) )
	        2.4 Enter your company name ( nextLine() )
	        2.5 Enter your job title ( nextLine() )
	        2.6 Enter your salary (nextDouble() )
	        Display:
	            Employee's name
	            EMployee's age
	            Employee's gender
	            Company name
	            Employee's job title
	            Employee's salary
 */