package Day37_Exceptions;

import Day35_polymorphism.transpotationTask.Car;

import java.sql.SQLOutput;

public class MultiCatchBlock {
    public static void main(String[] args) {
        Car car = null;

        try {
            car.drive();
        } catch (ArithmeticException e) {
            System.out.println("First Catch Block.");
            e.printStackTrace();
        }catch(ClassCastException e){
            System.out.println("Second Catch Block.");
            e.printStackTrace();
        }catch(NullPointerException e){
            System.out.println("Third Catch Block.");
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e) {
            System.out.println("Fourt Catch Block.");
            e.printStackTrace();
        }catch(RuntimeException e){
            System.out.println("Fifth Catch Block.");
            e.printStackTrace();
        }
        System.out.println("Program1 ended.");

        /*
        try{
        }catch (RuntimeException e){
        }try{
        }try{
        }try{
        }
   */

    }

}

