package Day19_Array;

import java.util.Arrays;

public class ArraysPractice1 {
    public static void main(String[] args) {


        String[] myGroup= new String[5];

        myGroup[0]="Gulcin";
        myGroup[myGroup.length-1]="Assel";
        myGroup[2]="Sumeye";
        myGroup[1] ="Abdullah";
        myGroup[3]= "Khashayar";
        System.out.println(Arrays.toString(myGroup));

        System.out.println("???????????????????????????????????????????????????????????");
        for (int i = myGroup.length-1; i>-0; i--) {
            System.out.println(myGroup[i]);
        }
        System.out.println("/////////////////////////////////////////////////");


        for (int i = 0; i < myGroup.length; i++) {
            
        }


    }
}
