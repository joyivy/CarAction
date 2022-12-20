package day20_forEach;

public class commenElements {
    public static void main(String[] args) {


        int[] arr1 = {1, 2, 3,8, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        for (int each : arr1) { // each ilk isim
            for (int element : arr2) { //element ikinci isim
                if (each == element) { // == esit ise, yani ilk isim ile ikinci isim arasinda esit ne varsa ver ablag
                    System.out.print(each + " ");


                }
            }
        }
    }
}
/*
Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5

 */