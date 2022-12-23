package Day37_Exceptions;

public class TryCatchBlock2 {

    public static void main(String[] args) {
        System.out.println("Program1 Started.");
        int[] arr = {1,2,3,4,};

        try{
            System.out.println(arr[1000]);
        }catch (RuntimeException e){
            e.printStackTrace(); // display full details of the exception after the exucution of program
        }
        System.out.println("Program1 Ended.");
    }
}
