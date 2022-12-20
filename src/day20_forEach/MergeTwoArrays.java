package day20_forEach;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2= {5,6,7};

        int[] arr3 = new int[arr1.length+arr2.length]; //to make sure third arrays enough capacity to contain all the element arry1 and arry2.

        int k = 0; // for third array's index number

        for (int i = 0; i < arr1.length; i++, k++) {
        arr3[k] =arr1[i];
        }
        for (int i = 0; i < arr2.length; i++, k++) { // i; for second array's index number
        arr3[k] = arr2[i];

        }

        System.out.println(Arrays.toString(arr3));

        }




    }

/*
write a program that can merge two arrays of integers
	        Ex:
	            arr1 = {1,2,3,4}
	            arr2 = {5,6}
	        output
	            arr3 = {1,2,3,4,5,6}
 */