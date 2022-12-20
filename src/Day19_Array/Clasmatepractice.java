package Day19_Array;

import java.util.Arrays;

public class Clasmatepractice {

    public static void main(String[] args) {

        String[] classmate = new String[10];
        classmate[0] = "Ahmet Abak";
        classmate[1] = "Melike Sinem Meral Abak";
        classmate[2] = "Gulsah Okmen";
        classmate[3] = "Serbay Gul";
        classmate[4] = "Mahmut Efe Senguller";
        classmate[5] = "AsliHan Uludogan";
        classmate[6] = "Gizem Kenez";
        classmate[7] = "Halim Aslan";
        classmate[8] = "Mehmet Evren Erdogan";
        classmate[9] = "Denis Ferhatovic";

        System.out.println(Arrays.toString(classmate));

        System.out.println("???????????????????????????????????????????????????????????");
        for (int i = classmate.length - 1; i > -0; i--) {
            System.out.println(classmate[i]);
        }
        System.out.println("/////////////////////////////////////////////////");


        for (int i = 0; i < classmate.length; i++) {


        }
    }
}

