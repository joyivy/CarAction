package Day21_multiDemisionalArray;

import java.util.Arrays;

public class iteratingMultiDemisionlArray {
    public static void main(String[] args) {
    //index of element     0  1  2     0  1  2  3  4    0   1
        int[][] arr2d = {{10,20,30}, {40,50,60,70,80}, {90,100 }};
    //index of Array          0              1             2

        for (int i = 0; i <arr2d.length ; i++) {
            int[]each1d = arr2d[i];
            System.out.println(Arrays.toString(arr2d[i]));
            for (int j = 0; j <each1d.length ; j++) { //j is index number of element each one 1d array

                int eachElement = each1d[j];
                System.out.println(eachElement);
            }

        }

        System.out.println(":::::::::::::::::::::::::::::::::::::::");

        for (int[] each1DArray : arr2d) {
            for (int eachElement : each1DArray) {
                System.out.println(eachElement);
            }
        }


        System.out.println("????????????????????????????????????????????");
        for (int i = arr2d.length - 1; i >= 0; i--) {
            for (int i1 = 0; i1 < arr2d[i].length; i1++) {
                System.out.println(arr2d[i][i1]);

            }

        }
        System.out.println("????????????????????????????????????????????????");
        for (int[] each1DArray : arr2d) {
            for (int eachElement : each1DArray) {
                System.out.println(eachElement);
            }
        }


        }

    }

